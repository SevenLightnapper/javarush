package javarush.java_multithreading_3.level8.lecture15_html_editor.listeners;

import javarush.java_multithreading_3.level8.lecture15_html_editor.View;

import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class UndoMenuListener implements MenuListener {
    private View view;
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;

    public UndoMenuListener(View view, JMenuItem undoMenuItem, JMenuItem redoMenuItem) {
        this.view = view;
        this.undoMenuItem = undoMenuItem;
        this.redoMenuItem = redoMenuItem;
    }

    @Override
    public void menuSelected(MenuEvent e) {
        // проверка undoMenuItem
        if (view.canUndo()) {
            undoMenuItem.setEnabled(true);
        }
        else if (!view.canUndo()) {
            undoMenuItem.setEnabled(false);
        }
        // проверка redoMenuItem
        if (view.canRedo()) {
            redoMenuItem.setEnabled(true);
        }
        else if (!view.canRedo()) {
            redoMenuItem.setEnabled(false);
        }
    }

    @Override
    public void menuDeselected(MenuEvent e) {

    }

    @Override
    public void menuCanceled(MenuEvent e) {

    }
}
