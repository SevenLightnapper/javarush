package javarush.java_multithreading_3.level3.lecture13.Arcanoid_part17;

public class Ball extends BaseObject {
    private double speed;
    private double direction;
    private double dx;
    private double dy;
    private boolean isFrozen;

    public Ball(double x, double y, double speed, double direction) {
        super(x, y, 1);

        this.direction = direction;
        this.speed = speed;

        this.isFrozen = true;
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    public double getDx() {
        return dx;
    }
    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
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
        double angle = Math.toRadians(direction);
        dx = Math.cos(angle) * speed;
        dy = -Math.sin(angle) * speed;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'O');
    }
    @Override
    public void move() {
        if(!isFrozen) {
            x += dx;
            y += dy;
        }
    }
    public void start() {
        isFrozen = false;
    }
    public void checkRebound(int minx, int maxx, int miny, int maxy) {

    }
}

