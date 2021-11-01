package seminar6;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Game2 {
    protected ArrayDeque<Integer> player1 = new ArrayDeque<Integer>();
    protected ArrayDeque<Integer> player2 = new ArrayDeque<Integer>();
    protected int count = 0;

    public void getCards() {
        System.out.println("Enter cards:");
        Scanner in = new Scanner(System.in);
        int x;

        for (int i = 0; i < 5; ++i) {
            x = in.nextInt();
            player1.addLast(x);
        }

        for (int i = 0; i < 5; ++i) {
            x = in.nextInt();
            player2.addLast(x);
        }
    }

    public void play() {
        getCards();
        int x1, x2;
        if (count < 106) {
            while (!player1.isEmpty() && !player2.isEmpty()) {
                x1 = player1.pop();
                x2 = player2.pop();
                ++count;

                if (x1 == 0 && x2 == 9) {
                    player1.addLast(x1);
                    player1.addLast(x2);
                } else if (x1 == 9 && x2 == 0) {
                    player2.addLast(x1);
                    player2.addLast(x2);
                } else if (x1 > x2) {
                    player1.addLast(x1);
                    player1.addLast(x2);
                } else {
                    player2.addLast(x1);
                    player2.addLast(x2);
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
