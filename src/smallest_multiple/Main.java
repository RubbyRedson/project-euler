package smallest_multiple;

/**
 * Created by Nick on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        int i = 2520;
        while (true) {
            if (isDivisibleByOneToTwenty(i)) {
                System.out.println(i);
                return;
            }
            i++;
        }
    }

    private static boolean isDivisibleByOneToTwenty(int number) {
        for (int i = 1; i < 21; i++) {
            if (number % i != 0)
                return false;
        }
        return true;
    }
}
