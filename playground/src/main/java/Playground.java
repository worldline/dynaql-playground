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

import static com.worldline.graphql.dynaql.request.Document.document;
import static com.worldline.graphql.dynaql.request.Field.field;
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
}
