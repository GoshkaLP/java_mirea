package seminar1.ball;

public class Ball {
    private String color;
    private int radius;
    private double square;

    public void setSquare(int r) {
        this.square = Math.PI * 4 * r * r;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
        setSquare(this.radius);
    }

    public double getSquare() {
        return square;
    }

    public Ball(String c, int r) {
        setRadius(r);
        setColor(c);
    }

    public Ball(String c) {
        setRadius(0);
        setColor(c);
    }

    public Ball(int r) {
        setColor("red");
        setRadius(r);
        setSquare(this.radius);
    }




    public String toString() {
        return "Ball is " + this.getColor() + " and has surface area = " + getSquare();
    }

}
