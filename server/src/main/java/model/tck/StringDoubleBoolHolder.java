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

public class StringDoubleBoolHolder {
    private String aString;
    private double aDouble;
    private boolean aBool;

    public StringDoubleBoolHolder() {

    }

    public StringDoubleBoolHolder(String aString, double aDouble, boolean aBool) {
        this.aString = aString;
        this.aDouble = aDouble;
        this.aBool = aBool;
    }

    public String getString() {
        return aString;
    }

    public void setString(String aString) {
        this.aString = aString;
    }

    public double getDouble() {
        return aDouble;
    }

    public void setDouble(double aDouble) {
        this.aDouble = aDouble;
    }

    public boolean getBool() {
        return aBool;
    }

    public void setBool(boolean aBool) {
        this.aBool = aBool;
    }
}
