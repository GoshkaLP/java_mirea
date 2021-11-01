package seminar6;

import java.util.Scanner;
import java.util.Stack;

public class Game1 {
    protected Stack<Integer> player1 = new Stack<Integer>();
    protected Stack<Integer> player2 = new Stack<Integer>();
    protected Stack<Integer> tmp = new Stack<Integer>();
    protected int count = 0;

    public void getCards() {
        System.out.println("Enter cards:");
        Scanner in = new Scanner(System.in);
        int x;

        for (int i = 0; i < 5; ++i) {
            x = in.nextInt();
            tmp.push(x);
        }

        while (!tmp.isEmpty()) {
            player1.push(tmp.pop());
        }

        for (int i = 0; i < 5; ++i) {
            x = in.nextInt();
            tmp.push(x);
        }

        while (!tmp.isEmpty()) {
            player2.push(tmp.pop());
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
                    while (!player1.isEmpty()) {
                        tmp.push(player1.pop());

                    }
                    tmp.push(x1);
                    tmp.push(x2);
                    while (!tmp.isEmpty()) {
                        player1.push(tmp.pop());
                    }
                } else if (x1 == 9 && x2 == 0) {
                    while (!player2.isEmpty()) {
                        tmp.push(player2.pop());

                    }
                    tmp.push(x1);
                    tmp.push(x2);
                    while (!tmp.isEmpty()) {
                        player2.push(tmp.pop());
                    }
                } else if (x1 > x2) {
                    while (!player1.isEmpty()) {
                        tmp.push(player1.pop());

                    }
                    tmp.push(x1);
                    tmp.push(x2);
                    while (!tmp.isEmpty()) {
                        player1.push(tmp.pop());
                    }
                } else {
                    while (!player2.isEmpty()) {
                        tmp.push(player2.pop());

                    }
                    tmp.push(x1);
                    tmp.push(x2);
                    while (!tmp.isEmpty()) {
                        player2.push(tmp.pop());
                    }
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
