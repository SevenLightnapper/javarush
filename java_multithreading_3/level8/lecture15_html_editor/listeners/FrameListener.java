package javarush.java_multithreading_3.level8.lecture15_html_editor.listeners;

import javarush.java_multithreading_3.level8.lecture15_html_editor.View;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameListener extends WindowAdapter {
    private View view;

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        view.exit();
    }

    public FrameListener(View view) {
        this.view = view;
    }
}
