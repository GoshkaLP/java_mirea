package seminar10;

public class HorseRaceThread extends Thread {
    protected int horseNumber;

    public HorseRaceThread(int horse) {
        horseNumber = horse;
    }

    public synchronized void sendMessage() {
        System.out.println("Horse " + horseNumber + " finished!");
    }

    @Override
    public void run() {
        sendMessage();
    }
}
