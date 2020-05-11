## Install DynaQL locally
```
cd dynaql-playground/dynaql
mvn clean install -DskipTests
```

## Start the server
```
cd dynaql-playground/server
mvn wildfly:run
```
http://localhost:8080/graphiql

## Start the playground
```
cd dynaql-playground/playground
mvn quarkus:dev
```
http://localhost:8081/play