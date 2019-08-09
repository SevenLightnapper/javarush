package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part18;


public class Stand extends BaseObject {
    private double speed;
    private double direction;

    public Stand(double x, double y, double radius) {
        super(x, y, radius);
    }
    public Stand(double x, double y) {
        super(x, y, 3);
        speed = 1;
        direction = 0;
    }

    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }
    public void setDirection(double direction) {
        this.direction = direction;
    }

    @Override
    public void move() { x+=speed*direction; }
    @Override
    public void draw(Canvas canvas) { }

    public void moveLeft(){ direction=-1; }
    public void moveRight(){ direction=1; }
}

