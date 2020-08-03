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

public class NestedObjectHolder {
    private byte level;
    private String name;
    private Byte[] levelLineage;
    private NestedObjectHolder[] nestedObjectLineage;
    private NestedObjectHolder nestedObject;

    public NestedObjectHolder() {
    }

    public byte getLevel() {
        return level;
    }

    public void setLevel(byte level) {
        this.level = level;
    }

    public NestedObjectHolder getNestedObject() {
        return nestedObject;
    }

    public void setNestedObject(NestedObjectHolder nestedObject) {
        this.nestedObject = nestedObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte[] getLevelLineage() {
        return levelLineage;
    }

    public void setLevelLineage(Byte[] levelLineage) {
        this.levelLineage = levelLineage;
    }

    public NestedObjectHolder[] getNestedObjectLineage() {
        return nestedObjectLineage;
    }

    public void setNestedObjectLineage(NestedObjectHolder[] nestedObjectLineage) {
        this.nestedObjectLineage = nestedObjectLineage;
    }
}
