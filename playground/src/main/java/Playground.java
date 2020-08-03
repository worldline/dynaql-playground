import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.worldline.graphql.dynaql.Client;
import com.worldline.graphql.dynaql.ClientBuilder;
import com.worldline.graphql.dynaql.client.Invocation;
import com.worldline.graphql.dynaql.request.Document;
import com.worldline.graphql.dynaql.request.Operation;
import com.worldline.graphql.dynaql.response.Response;

import static com.worldline.graphql.dynaql.request.Argument.arg;
import static com.worldline.graphql.dynaql.request.Argument.args;
import static com.worldline.graphql.dynaql.request.Document.document;
import static com.worldline.graphql.dynaql.request.Field.field;
import static com.worldline.graphql.dynaql.request.GraphQLEnum.gqlEnum;
import static com.worldline.graphql.dynaql.request.InputObject.object;
import static com.worldline.graphql.dynaql.request.InputObjectField.prop;
import static com.worldline.graphql.dynaql.request.Operation.operation;

@Path("/play")
public class Playground {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response play() {

        Document document = document(
                operation(Operation.Type.QUERY,
                        field("people",
                                field("id"),
                                field("names")
                        )));

        Client client = ClientBuilder.newBuilder().build();
        Invocation request = client.target("http://localhost:8080/graphql").request(document.toString()).build();

        return request.invoke();
    }

    @GET
    @Path("/profileFilterScore")
    @Produces(MediaType.APPLICATION_JSON)
    public Response profileFull() {

        Document document = document(

                operation(Operation.Type.QUERY, "MyQuery",

                        field("profileFull", args(arg("personId", 1)),

                                field("id"),

                                field("person",

                                        field("occupation"),

                                        field("birthDate")),

                                field("scores",

                                        args(arg("scoreCriteria",

                                                object(
                                                        prop("name", gqlEnum("Activity")),
                                                        prop("minValue", 60)
                                                )

                                        )),

                                        field("name"),

                                        field("value"))
                        )));

        Client client = ClientBuilder.newBuilder().build();
        Invocation request = client.target("http://localhost:8080/graphql").request(document.toString()).build();

        return request.invoke();
    }
}
