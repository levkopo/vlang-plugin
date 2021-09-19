package ru.levkopo.vlangPlugin.pw;

import com.intellij.ui.FieldPanel;

public class VModuleBuilder {
    public final FieldPanel name = new FieldPanel();
    public final FieldPanel description = new FieldPanel();
    public final FieldPanel version = new FieldPanel();

    public VModuleBuilder() {
        name.setText("untitled");
        version.setText("1.0.0");
    }
}
