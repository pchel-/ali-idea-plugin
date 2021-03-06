/*
 * Copyright 2014 Hewlett-Packard Development Company, L.P
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

package com.hp.alm.ali.idea.action.acceptance;

import com.hp.alm.ali.idea.action.EntityAction;
import com.hp.alm.ali.idea.entity.EntityEditManager;
import com.hp.alm.ali.idea.model.Entity;
import com.hp.alm.ali.idea.ui.editor.AcceptanceTestEditor;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.util.IconLoader;

import java.util.Collections;
import java.util.Set;

public class TestEditAction extends EntityAction {

    public TestEditAction() {
        super("Edit", "Edit Acceptance Test", IconLoader.getIcon("/actions/editSource.png"));
    }

    @Override
    protected Set<String> getSupportedEntityTypes() {
        return Collections.singleton("acceptance-test");
    }

    @Override
    public void update(AnActionEvent event, Project project, Entity entity) {
        EntityEditManager entityEditManager = project.getComponent(EntityEditManager.class);
        event.getPresentation().setEnabled(!entityEditManager.isEditing(entity));
    }

    @Override
    protected void actionPerformed(AnActionEvent event, Project project, Entity entity) {
        AcceptanceTestEditor editor = new AcceptanceTestEditor(project, entity);
        editor.execute();
    }
}
