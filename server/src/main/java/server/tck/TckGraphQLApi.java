package server.tck;

import model.tck.ArrayHolder;
import model.tck.GraphQLScalarHolder;
import model.tck.JavaScalarHolder;
import model.tck.NestedArraysHolder;
import model.tck.NestedObjectHolder;
import model.tck.StringDoubleBoolHolder;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Query;

/**
 * API used to run the TCK tests of the dynamic client.
 */
@GraphQLApi
public class TckGraphQLApi {

    @Query
    public String helloWorld() {
        return "helloWorld";
    }

    @Query
    public String helloYou(@DefaultValue("Lee Byron") String name) {
        return "Hello " + name + "!";
    }

    @Mutation
    public JavaScalarHolder javaScalarHolder(JavaScalarHolder javaScalarHolder) {
        return javaScalarHolder;
    }

    @Query
    public GraphQLScalarHolder graphQLScalarHolder(GraphQLScalarHolder graphQLScalarHolder) {
        return graphQLScalarHolder;
    }

    @Query
    public ArrayHolder arrayHolder(ArrayHolder arrayHolder) {
        return arrayHolder;
    }

    @Mutation
    public NestedObjectHolder nestedObjectHolder(NestedObjectHolder nestedObjectHolder) {
        return nestedObjectHolder;
    }

    @Query
    public String noArgNoSubField() {
        return "noArgNoSubField";
    }

    @Query
    public int withArgNoSubField(int anInt) {
        return anInt;
    }

    @Query
    public StringDoubleBoolHolder noArgWithSubField() {
        return new StringDoubleBoolHolder("hello", 42.42d, true);
    }

    @Query
    public StringDoubleBoolHolder withArgWithSubField(String aString, double aDouble, boolean aBool) {
        return new StringDoubleBoolHolder(aString, aDouble, aBool);
    }

    @Mutation
    public NestedArraysHolder nestedArraysHolder(NestedArraysHolder nestedArraysHolder) {
        return nestedArraysHolder;
    }
}
