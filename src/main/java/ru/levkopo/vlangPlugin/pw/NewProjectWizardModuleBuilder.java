package ru.levkopo.vlangPlugin.pw;

import com.intellij.ide.plugins.newui.VerticalLayout;
import com.intellij.ide.util.projectWizard.ModuleBuilder;
import com.intellij.ide.util.projectWizard.ModuleWizardStep;
import com.intellij.ide.util.projectWizard.WizardContext;
import com.intellij.openapi.module.ModuleType;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.roots.ui.configuration.ModulesProvider;
import com.twelvemonkeys.io.FileUtil;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public class NewProjectWizardModuleBuilder extends ModuleBuilder {
    public static final String ID = "v_lang";
    public static final VModuleBuilder settings = new VModuleBuilder();

    @Override
    public boolean canCreateModule() {
        return false;
    }

    @Override
    public @Nls(capitalization = Nls.Capitalization.Title) String getPresentableName() {
        return getModuleType().getName();
    }

    @Override
    public String getDescription() {
        return getModuleType().getDescription();
    }

    @Override
    public String getGroupName() {
        return getModuleType().getName();
    }

    @Override
    public boolean isOpenProjectSettingsAfter() {
        return false;
    }

    @Override
    public ModuleType<?> getModuleType() {
        return new NewProjectWizardModuleType();
    }

    @Override
    public ModuleWizardStep[] createWizardSteps(@NotNull WizardContext wizardContext, @NotNull ModulesProvider modulesProvider) {
        return new ModuleWizardStep[]{
                new ModuleWizardStep() {
                    @Override
                    public JComponent getComponent() {
                        JPanel panel = new JPanel(new VerticalLayout(0));
                        settings.name.setLabelText("Project name");
                        panel.add(settings.name);

                        settings.description.setLabelText("Description");
                        panel.add(settings.description);

                        settings.version.setLabelText("Version");
                        panel.add(settings.version);

                        return panel;
                    }

                    @Override public void updateDataModel() {}
                }
        };
    }



    @Override
    public void setupRootModel(@NotNull ModifiableRootModel modifiableModel) throws ConfigurationException {
        super.setupRootModel(modifiableModel);

        modifiableModel.inheritSdk();
        ContentEntry[] contentEntries = modifiableModel.getContentEntries();
        if(contentEntries.length!=0){
            ContentEntry contentEntry = contentEntries[0];
            contentEntry.addSourceFolder(
                    Objects.requireNonNull(modifiableModel.getProject().getProjectFile()), false);
            modifiableModel.commit();
        }

        File moduleConfig = new File(modifiableModel.getProject().getBasePath(), "v.mod");
        try {
            FileUtil.write(moduleConfig, ("Module {\n" +
                    "\tname: '"+settings.name.getText()+"'\n" +
                    "\tdescription: '"+settings.description.getText()+"'\n" +
                    "\tversion: '"+settings.version.getText()+"'\n" +
                    "}"
            ).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
