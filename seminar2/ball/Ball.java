package seminar2.ball;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

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

    public void setXY(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    public Ball(double x, double y) {
        this.setXY(x, y);
    }

    public Ball() {
        this.setXY(0, 0);
    }

    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }

    public String toString() {
        return "Ball x coord is: " + this.getX() + " and y coord is: " + this.getY();
    }
}
