package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part14.yo;

import javarush.java_multithreading_3.level3.lecture13.Arcanoid_part14.Canvas;

import static java.lang.Math.*;

public abstract class BaseObject {
    protected double x;
    protected double y;
    protected double radius;

    public BaseObject(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    boolean isIntersec(BaseObject o) {
        return hypot(this.x - o.x, this.y - o.y) <= max(this.radius, o.radius);
    }

    public abstract void draw(Canvas canvas);

    public abstract void move();
}

