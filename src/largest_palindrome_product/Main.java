package largest_palindrome_product;

/**
 * Created by Nick on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        int maxPalindrome = -1;
        for (int i = 999; i >= 100; i--)
            for (int j = 999; j >= 100; j--) {
                if (isPalindrome(i * j)) {
                    if (i * j > maxPalindrome)
                        maxPalindrome = i * j;
                }
            }
        System.out.println(maxPalindrome);
    }

    private static boolean isPalindrome(int number) {
        String s = number + "";
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
}
