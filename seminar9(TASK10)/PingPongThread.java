package seminar9;

public class PingPongThread extends Thread {
    protected Object lock;
    protected String msg;
    protected int count = 1;

    public PingPongThread(String message, Object obj) {
        msg = message;
        lock = obj;
    }

    public void sendMessage() {
        System.out.println(msg + "(" + count++ + ")");
    }

    @Override
    public void run() {
        synchronized (lock) {
            while (true) {
                sendMessage();

                try {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ex1) {}
                lock.notify();

                try {
                    lock.wait();
                }
                catch (InterruptedException ex2) {}
            }
        }
    }
}
