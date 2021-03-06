/*
 * Copyright 2013 Hewlett-Packard Development Company, L.P
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hp.alm.ali.idea.content.devmotive;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

final public class CommitInfo {

    private Integer id;
    private List<Integer> defects = new LinkedList<Integer>();
    private List<Integer> requirements = new LinkedList<Integer>();

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void addDefect(int id) {
        defects.add(id);
    }

    public List<Integer> getDefects() {
        return Collections.unmodifiableList(defects);
    }

    public void addRequirement(int id) {
        requirements.add(id);
    }

    public List<Integer> getRequirements() {
        return Collections.unmodifiableList(requirements);
    }
}
