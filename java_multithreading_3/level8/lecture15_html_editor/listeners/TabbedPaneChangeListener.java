package javarush.java_multithreading_3.level8.lecture15_html_editor.listeners;

import javarush.java_multithreading_3.level8.lecture15_html_editor.View;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabbedPaneChangeListener implements ChangeListener {
    private View view;

    public TabbedPaneChangeListener(View view) {
        this.view = view;
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        view.selectedTabChanged();
    }
}
