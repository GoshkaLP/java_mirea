package seminar10;

import seminar10.HorseRaceThread;

import java.util.Scanner;

public class MainCode {
    public static void main(String[] args) {
        System.out.println("Enter number of horses:");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        for (int i = 1; i < n + 1; ++i) {
            HorseRaceThread t = new HorseRaceThread(i);
            t.start();
        }
    }

}
