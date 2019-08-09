package javarush.java_multithreading_3.level8.lecture15_html_editor.actions;

import javarush.java_multithreading_3.level8.lecture15_html_editor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class UndoAction extends AbstractAction {
    private View view;

    public UndoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.undo();
    }
}
