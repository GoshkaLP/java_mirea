package seminar4;

public class task6 {

    static boolean isPrime(int n, int i) {
        // Базовые случаи
        if (n == 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        // Шаг рекурсии
        return isPrime(n, i + 1);
    }

    static void printPrime(int n) {
        System.out.print("The number " + n);
        if (isPrime(n, 2)) {
            System.out.println(" is prime.");
        } else {
            System.out.println(" is not prime.");
        }
    }

    public static void main(String[] args) {
        int n = 2;
        printPrime(n);

        n = 10;
        printPrime(n);

        n = 13;
        printPrime(n);

        n = 20;
        printPrime(n);
    }
}
