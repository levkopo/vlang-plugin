package ru.levkopo.vlangPlugin.pw;

import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.NotNull;
import ru.levkopo.vlangPlugin.data.Icons;

import javax.swing.*;

public class NewProjectWizardModuleType extends ModuleType<NewProjectWizardModuleBuilder> {

    protected NewProjectWizardModuleType() {
        super(NewProjectWizardModuleBuilder.ID);
    }

    @NotNull
    @Override
    public NewProjectWizardModuleBuilder createModuleBuilder() {
        return new NewProjectWizardModuleBuilder();
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Title) String getName() {
        return "V Lang";
    }

    @Override
    public @NotNull @Nls(capitalization = Nls.Capitalization.Sentence) String getDescription() {
        return "Simple V Lang project";
    }

    @Override
    public @NotNull Icon getNodeIcon(boolean isOpened) {
        return Icons.V_FILE;
    }
}
