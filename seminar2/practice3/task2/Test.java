package seminar2.practice3.task2;

public class Test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(2, 3, 6, 5, 2);
        System.out.println(circle);

        circle.moveUp();
        System.out.println(circle);

        circle.moveLeft();
        System.out.println(circle);

        circle.moveRight();
        System.out.println(circle);

        circle.moveDown();
        System.out.println(circle);

        System.out.println("-------");

        MovableRectangle rectangle = new MovableRectangle(2,3, 5, 1, 4, 4);
        System.out.println(rectangle);

        rectangle.moveUp();
        System.out.println(rectangle);

        rectangle.moveLeft();
        System.out.println(rectangle);

        rectangle.moveRight();
        System.out.println(rectangle);

        rectangle.moveDown();
        System.out.println(rectangle);
    }
}
