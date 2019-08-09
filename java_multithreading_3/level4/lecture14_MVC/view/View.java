package javarush.java_multithreading_3.level4.lecture14_MVC.view;

import javarush.java_multithreading_3.level4.lecture14_MVC.controller.Controller;
import javarush.java_multithreading_3.level4.lecture14_MVC.model.ModelData;

public interface View {

    void refresh(ModelData modelData);

    void setController(Controller controller);
}
