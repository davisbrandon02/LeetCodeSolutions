package Solutions;

public class _9_PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1000));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int originalNum = x;
        int storedNum = x;
        int reverse = 0;

        while (storedNum > 0) {
            int digit = (storedNum % 10);
            storedNum = storedNum / 10;
            reverse = reverse * 10;
            reverse = reverse + digit;
        }

        return (originalNum == reverse);
    }
}
