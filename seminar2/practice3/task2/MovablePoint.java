package seminar2.practice3.task2;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "x coord is " + this.x + ", y coord is " + this.y +
                ", xSpeed is " + this.xSpeed + ", ySpeed is " + this.ySpeed;
    }

    @Override
    public void moveUp() {
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x += xSpeed;
    }

    @Override
    public void moveRight() {
        this.x -= xSpeed;
    }
}
