package seminar11;

import java.util.Scanner;

public class Driver {
    public static void menu() {
        System.out.println(
                "Menu\n" +
                        "1) Print generated students array\n" +
                        "2) Sort students array\n" +
                        "3) Find student\n" +
                        "0) Exit\n" +
                        "~"
        );
    }

    public static void printArr(Student[] arr) {
        for (int i = 0; i < arr.length; ++i) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int count = scanner.nextInt();
        Student tmp = new Student();
        Student[] arr = tmp.generateArray(count);
        int op = -1;
        while (op != 0) {
            menu();
            op = scanner.nextInt();
            if (op == 1) {
                printArr(arr);
            } else if (op == 2) {
                tmp.quickSort(arr, 0, arr.length-1);
            } else if (op == 3) {
                try {
                    String name, surname;
                    System.out.println("Input name:");
                    name = scanner.next();
                    System.out.println("Input surname:");
                    surname = scanner.next();
                    Student res = tmp.searchStudent(name, surname, arr);
                    System.out.println("Student " + res.getName() + " " + res.getSurname() + " was founded!");
                } catch (StudentNotFoundException | EmptyStringException e1) {
                    System.out.println(e1.getMessage());
                }
            }
        }
    }
}
