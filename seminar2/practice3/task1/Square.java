package seminar2.practice3.task1;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        width = side;
    }

    @Override
    public void setLength(double side) {
        length = side;
    }

    @Override
    public String toString() {
        return "Square side is " + getSide() + ", color is " + getColor() +
                ", area is " + getArea() + ", perimeter is " + getArea();
    }
}
