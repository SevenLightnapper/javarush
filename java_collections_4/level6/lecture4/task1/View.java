package javarush.java_collections_4.level6.lecture4.task1;


public class View {
    private static Controller controller = new Controller();

    public void fireShowDataEvent() {
        System.out.println(controller.onShowDataList());
    }
}