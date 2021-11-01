package seminar6;

import java.util.Scanner;

public class Menu {

    public static void menu() {
        System.out.println("\nMenu:");
        System.out.println("1) Game with Stack");
        System.out.println("2) Game with Queue using Deque");
        System.out.println("3) Game with ArrayList");
        System.out.println("0) Exit");
        System.out.println("~");
    }

    public static void main(String[] args) {
        int op;
        Scanner in = new Scanner(System.in);
        while (true) {
            menu();
            op = in.nextInt();
            if (op == 0) {
                break;
            } else if (op == 1) {
                Game1 game1 = new Game1();
                game1.play();
            } else if (op == 2) {
                Game2 game2 = new Game2();
                game2.play();
            } else if (op == 3) {
                Game3 game3 = new Game3();
                game3.play();
            }
        }
    }
}
