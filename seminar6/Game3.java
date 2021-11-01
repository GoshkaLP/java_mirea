package seminar6;

import java.util.ArrayList;
import java.util.Scanner;

public class Game3 {
    protected ArrayList<Integer> player1 = new ArrayList<Integer>();
    protected ArrayList<Integer> player2 = new ArrayList<Integer>();
    protected int count = 0;

    public void getCards() {
        System.out.println("Enter cards:");
        Scanner in = new Scanner(System.in);
        int x;

        for (int i = 0; i < 5; ++i) {
            x = in.nextInt();
            player1.add(x);
        }

        for (int i = 0; i < 5; ++i) {
            x = in.nextInt();
            player2.add(x);
        }
    }

    public void play() {
        getCards();
        int x1, x2;
        if (count < 106) {
            while (!player1.isEmpty() && !player2.isEmpty()) {
                x1 = player1.remove(0);
                x2 = player2.remove(0);
                ++count;

                if (x1 == 0 && x2 == 9) {
                    player1.add(x1);
                    player1.add(x2);
                } else if (x1 == 9 && x2 == 0) {
                    player2.add(x1);
                    player2.add(x2);
                } else if (x1 > x2) {
                    player1.add(x1);
                    player1.add(x2);
                } else {
                    player2.add(x1);
                    player2.add(x2);
                }

            }
            if (player1.isEmpty()) {
                System.out.println("second " + count);
            } else if (player2.isEmpty()) {
                System.out.println("first " + count);
            }
        } else {
            System.out.println("botva");
        }
    }
}
