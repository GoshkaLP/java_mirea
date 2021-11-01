package seminar4;

public class task8 {

    static boolean isPal(String s, int i, int j) {
        if (i == j) {
            return true;
        }

        if (s.charAt(i) != s.charAt(j)) {
            return false;
        }

        if (i < j + 1) {
            return isPal(s, i + 1, j - 1);
        }
        return true;
    }

    static void isPalindrome(String s) {
        System.out.print("The given string " + s);
        if (isPal(s, 0, s.length()-1)) {
            System.out.println(" is palindrome.");
        } else {
            System.out.println(" is not palindrome.");
        }
    }

    public static void main(String[] args) {
        String s = "abba";
        isPalindrome(s);

        s = "abcd";
        isPalindrome(s);

        s = "dfgfd";
        isPalindrome(s);

        s = "asdfert";
        isPalindrome(s);
    }
}
