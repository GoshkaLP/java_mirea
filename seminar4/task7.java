package seminar4;

public class task7 {

    static void getPrimeFactors(int n, int i) {
        if (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
                getPrimeFactors(n / i, i);
            } else {
                getPrimeFactors(n, i + 1);
            }
        }
    }

    static void printPrimeFactors(int n) {
        System.out.print("Prime factors of " + n + ": ");
        getPrimeFactors(n, 2);
        System.out.println();
    }


    public static void main(String[] args) {
        int n = 2;
        printPrimeFactors(n);

        n = 10;
        printPrimeFactors(n);

        n = 13;
        printPrimeFactors(n);

        n = 20;
        printPrimeFactors(n);
    }
}
