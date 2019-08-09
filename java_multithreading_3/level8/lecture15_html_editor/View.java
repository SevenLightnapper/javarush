package javarush.java_multithreading_3.level8.lecture15_html_editor;

import javarush.java_multithreading_3.level8.lecture15_html_editor.listeners.FrameListener;
import javarush.java_multithreading_3.level8.lecture15_html_editor.listeners.TabbedPaneChangeListener;
import javarush.java_multithreading_3.level8.lecture15_html_editor.listeners.UndoListener;

import javax.swing.*;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.swing.undo.UndoManager;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Controller controller;
    private UndoManager undoManager = new UndoManager();
    private UndoListener undoListener = new UndoListener(undoManager);
    // панель с двумя вкладками. Он будет размещен на первой вкладке
    private JTabbedPane tabbedPane = new JTabbedPane();
    // компонент для визуального редактирования html
    private JTextPane htmlTextPane = new JTextPane();
    // компонент для редактирования html в виде текста,
    // он будет отображать код html (теги и их содержимое)
    private JEditorPane plainTextPane = new JEditorPane();

    public View() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (IllegalAccessException e) {
            ExceptionHandler.log(e);
        } catch (InstantiationException e) {
            ExceptionHandler.log(e);
        } catch (UnsupportedLookAndFeelException e) {
            ExceptionHandler.log(e);
        } catch (ClassNotFoundException e) {
            ExceptionHandler.log(e);
        }
    }

    public UndoListener getUndoListener() {
        return undoListener;
    }

    public Controller getController() {
        return controller;
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        switch (actionEvent.getActionCommand()) {
            case "Новый" :
                controller.createNewDocument();
            case "Открыть" :
                controller.openDocument();
            case "Сохранить" :
                controller.saveDocument();
            case "Сохранить как..." :
                controller.saveDocumentAs();
            case "Выход" :
                controller.exit();
            case "О программе" :
                showAbout();
        }
    }

    public void selectedTabChanged() {
        //Метод должен проверить, какая вкладка сейчас оказалась выбранной
        //Если выбрана вкладка с индексом 0 (html вкладка)
        if (tabbedPane.getSelectedIndex() == 0) {
            //значит нам нужно получить текст из plainTextPane и установить его в контроллер с помощью метода setPlainText
            controller.setPlainText(plainTextPane.getText());
        }
        //сли выбрана вкладка с индексом 1 (вкладка с html текстом)
        else {
            //необходимо получить текст у контроллера с помощью метода getPlainText() и установить его в панель plainTextPane
            plainTextPane.setText(controller.getPlainText());
        }
        //Сбросить правки
        resetUndo();
    }

    public void showAbout() {
        JOptionPane.showMessageDialog(this, "HTML Editor", "About", JOptionPane.INFORMATION_MESSAGE);
    }

    public void update() {
        htmlTextPane.setDocument(controller.getDocument());
    }

    public void selectHtmlTab() {
        //Выбирать html вкладку (переключаться на нее)
        tabbedPane.setSelectedIndex(0);
        //Сбрасывать все правки с помощью метода
        resetUndo();
    }

    public boolean isHtmlTabSelected() {
        return tabbedPane.getSelectedIndex() == 0;
    }

    public boolean canUndo() {
        return undoManager.canUndo();
    }

    public boolean canRedo() {
        return undoManager.canRedo();
    }

    public void undo() {
        try {
            undoManager.undo();
        } catch (CannotUndoException e) {
            ExceptionHandler.log(e);
        }
    }
    public void redo() {
        try {
            undoManager.redo();
        } catch (CannotRedoException e) {
            ExceptionHandler.log(e);
        }
    }

    public void resetUndo() {
        undoManager.discardAllEdits();
    }

    public void init() {
        initGui();
        //Добавлять слушателя событий нашего окна
        FrameListener frameListener = new FrameListener(this);
        addWindowListener(frameListener);
        //Показывать наше окно
        setVisible(true);
    }

    public void exit() {
        controller.exit();
    }

    public void initMenuBar() {
        //Создавать новый объект типа JMenuBar. Это и будет наша панель меню
        JMenuBar jMenuBar = new JMenuBar();
        //С помощью MenuHelper инициализировать меню
        MenuHelper.initFileMenu(this, jMenuBar);
        MenuHelper.initEditMenu(this, jMenuBar);
        MenuHelper.initStyleMenu(this, jMenuBar);
        MenuHelper.initAlignMenu(this, jMenuBar);
        MenuHelper.initColorMenu(this, jMenuBar);
        MenuHelper.initFontMenu(this, jMenuBar);
        MenuHelper.initHelpMenu(this, jMenuBar);

        //Добавлять в верхнюю часть панели контента текущего фрейма нашу панель меню,
        // аналогично тому, как это мы делали с панелью вкладок
        getContentPane().add(jMenuBar, BorderLayout.NORTH);
    }

    public void initEditor() {
        //Устанавливать значение "text/html" в качестве типа контента для компонента htmlTextPane
        htmlTextPane.setContentType("text/html");

        //Создавать новый локальный компонент JScrollPane на базе htmlTextPane
        //Добавлять вкладку в панель tabbedPane с именем "HTML" и компонентом из предыдущего пункта
        tabbedPane.addTab("HTML", new JScrollPane(htmlTextPane));

        //Создавать новый локальный компонент JScrollPane на базе plainTextPane
        //Добавлять еще одну вкладку в tabbedPane с именем "Текст" и компонентом из предыдущего пункта
        tabbedPane.addTab("Текст", new JScrollPane(plainTextPane));

        //Устанавливать предпочтительный размер панели tabbedPane
        tabbedPane.setPreferredSize(new Dimension(800, 600));

        //Создавать объект класса TabbedPaneChangeListener и устанавливать его в качестве слушателя изменений в tabbedPane
        tabbedPane.addChangeListener(new TabbedPaneChangeListener(this));

        //Добавлять по центру панели контента текущего фрейма нашу панель с вкладками
        getContentPane().add(tabbedPane,BorderLayout.CENTER);
    }

    public void initGui() {
        initMenuBar();
        initEditor();
        pack();
    }
}
