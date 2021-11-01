package seminar1.ball;

public class BallTest {
    public static void main(String[] args) {
        Ball b1 = new Ball("blue", 4);
        Ball b2 = new Ball(2);
        Ball b3 = new Ball("green");
        b3.setRadius(6);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
