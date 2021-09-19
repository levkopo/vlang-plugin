package ru.levkopo.vlangPlugin.actions;

import com.intellij.ide.util.projectWizard.AbstractNewProjectStep;
import com.intellij.ide.util.projectWizard.ProjectSettingsStepBase;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.DialogWrapper;
import com.intellij.util.ui.JBUI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.levkopo.vlangPlugin.pw.VModuleBuilder;
import ru.levkopo.vlangPlugin.pw.VProjectGenerator;

import javax.swing.*;
import java.awt.*;

public class NewVProject extends ProjectSettingsStepBase<VModuleBuilder> {
    public NewVProject() {
        super(new VProjectGenerator(), new AbstractNewProjectStep.AbstractCallback<>());
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        super.actionPerformed(e);

        JPanel panel = new JPanel();
        panel.setPreferredSize(JBUI.size(600, 300));
        new NewProjectDialog(panel).show();
    }

    private static class NewProjectDialog extends DialogWrapper {
        private final JPanel centerPanel;

        protected NewProjectDialog(JPanel centerPanel) {
            super(true);
            this.centerPanel = centerPanel;
            init();
        }

        @Override
        protected JComponent createSouthPanel() {
            return null;
        }

        @Override
        protected @Nullable JComponent createCenterPanel() {
            return centerPanel;
        }
    }
}
