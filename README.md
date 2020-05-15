# Setup
## Install DynaQL locally
First, initialize and update the DynaQL git submodule (https://github.com/worldline/dynaql):
```
cd dynaql-playground
git submodule init
git submodule update
```
Then, trigger a maven install of DynaQL:
```
cd dynaql-playground/dynaql
mvn clean install
```

## Start the GraphQL server (Wildfly)
```
cd dynaql-playground/server
mvn clean wildfly:run
```
GraphiQL UI: http://localhost:8080/graphiql

## Start the playground (Quarkus)
```
cd dynaql-playground/playground
mvn clean quarkus:dev
```
Default endpoint: http://localhost:8081/play

# Play !
In the **playground** project you will find a sample class (Playground.java) that expose a single endpoint ("/play").
This endpoint will execute a GraphQL query against the local GraphQL server (be sure to start the server first).
```java
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
```

Feel free to customize it or create new endpoints and start to play with dynaql !