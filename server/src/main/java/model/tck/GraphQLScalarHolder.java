/*
 * Copyright (c) 2020 Contributors to the Eclipse Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package model.tck;

import org.eclipse.microprofile.graphql.Id;

public class GraphQLScalarHolder {
    private boolean aBool;
    private int aInt;
    private float aFloat;
    private String aString;
    private String aID;

    public GraphQLScalarHolder() {

    }

    public boolean isBool() {
        return aBool;
    }

    public void setBool(boolean aBool) {
        this.aBool = aBool;
    }

    public int getInt() {
        return aInt;
    }

    public void setInt(int aInt) {
        this.aInt = aInt;
    }

    public float getFloat() {
        return aFloat;
    }

    public void setFloat(float aFloat) {
        this.aFloat = aFloat;
    }

    public String getString() {
        return aString;
    }

    public void setString(String aString) {
        this.aString = aString;
    }

    @Id
    public String getID() {
        return aID;
    }

    public void setID(@Id String aID) {
        this.aID = aID;
    }
}
