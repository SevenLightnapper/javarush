package javarush.java_multithreading_3.level4.lecture4.task3;

public abstract class FirstClass implements Action {     //first implementation

    protected FirstClass() {
        Solution.countActionObjects++;
    }

    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();
}

