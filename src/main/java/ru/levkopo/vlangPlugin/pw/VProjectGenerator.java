package ru.levkopo.vlangPlugin.pw;

import com.intellij.ide.plugins.newui.VerticalLayout;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ContentEntry;
import com.intellij.openapi.roots.ModifiableModelsProvider;
import com.intellij.openapi.roots.ModifiableRootModel;
import com.intellij.openapi.ui.ValidationInfo;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.platform.DirectoryProjectGenerator;
import com.intellij.platform.DirectoryProjectGeneratorBase;
import com.intellij.platform.GeneratorPeerImpl;
import com.intellij.platform.ProjectGeneratorPeer;
import com.intellij.ui.FieldPanel;
import com.twelvemonkeys.io.FileUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.levkopo.vlangPlugin.data.Icons;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class VProjectGenerator extends DirectoryProjectGeneratorBase<VModuleBuilder>{
    @Override
    public @NotNull String getName() {
        return "V lang";
    }

    @Override
    public @Nullable Icon getLogo() {
        return Icons.V_FILE;
    }

    @Override
    public @NotNull ProjectGeneratorPeer<VModuleBuilder> createPeer() {
        return new GeneratorPeerImpl<>(new VModuleBuilder(), new JPanel()) {

            @Override
            public @NotNull JComponent getComponent() {
                JPanel panel = new JPanel(new VerticalLayout(0));
                getSettings().name.setLabelText("Project name");
                panel.add(getSettings().name);

                getSettings().description.setLabelText("Description");
                panel.add(getSettings().description);

                getSettings().version.setLabelText("Version");
                getSettings().version.setText("1.0.0");
                panel.add(getSettings().version);

                return panel;
            }

            @Override
            public @Nullable ValidationInfo validate() {
                if (getSettings().name.getText().length() == 0) return null;
                return new ValidationInfo("Project Name is empty", getSettings().name);
            }
        };
    }

    @Override
    public void generateProject(@NotNull Project project, @NotNull VirtualFile baseDir, @NotNull VModuleBuilder settings, @NotNull Module module) {
        ApplicationManager.getApplication().runWriteAction(() -> {
            ModifiableModelsProvider provider = ModifiableModelsProvider.SERVICE.getInstance();
            ModifiableRootModel modifiableModel =  provider.getModuleModifiableModel(module);

            modifiableModel.inheritSdk();
            ContentEntry[] contentEntries = modifiableModel.getContentEntries();
            if(contentEntries.length!=0){
                ContentEntry contentEntry = contentEntries[0];
                contentEntry.addSourceFolder(baseDir, false);
                modifiableModel.commit();
            }

            provider.commitModuleModifiableModel(modifiableModel);

            File moduleConfig = new File(baseDir.getPath(), "v.mod");
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
        });
    }
}
