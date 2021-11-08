package seminar9;

public class MainCode {

    public static void main(String[] args) {
        Object lock = new Object();
        PingPongThread ping = new PingPongThread("Ping", lock);
        PingPongThread pong = new PingPongThread("Pong", lock);
        ping.start();
        pong.start();
    }
}
