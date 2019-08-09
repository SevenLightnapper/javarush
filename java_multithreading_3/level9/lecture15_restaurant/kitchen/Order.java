package javarush.java_multithreading_3.level9.lecture15_restaurant.kitchen;

import javarush.java_multithreading_3.level9.lecture15_restaurant.ConsoleHelper;
import javarush.java_multithreading_3.level9.lecture15_restaurant.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    protected List<Dish> dishes;
    private Tablet tablet;
    private Cook cook;

    public Order(Tablet tablet) throws IOException {
        this.tablet = tablet;
        initDishes();
    }

    protected void initDishes() throws IOException {
        dishes = ConsoleHelper.getAllDishesForOrder();
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public Tablet getTablet() {
        return tablet;
    }

    public Cook getCook() {
        return cook;
    }

    public void setCook(Cook cook) {
        this.cook = cook;
    }

    public boolean isEmpty() {
        return dishes == null || dishes.isEmpty();
    }

    public int getTotalCookingTime() {
        int totalTime = 0;
        for (Dish dish : dishes)
            totalTime += dish.getDuration();
        return totalTime;
    }

    @Override
    public String toString() {
        String res = "";
        if (!dishes.isEmpty())
            res = "Your order: " + dishes + " of " + tablet.toString();
        return res;
    }
}