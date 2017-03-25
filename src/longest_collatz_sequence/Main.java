package longest_collatz_sequence;

/**
 * Created by Nick on 3/25/2017.
 */
public class Main {

    public static void main(String[] args) {
        long length = -1;
        long number = -1;
        for (long i = 1; i <= 1000000; i++) {
            if (getChainLength(i) > length) {
                length = getChainLength(i);
                number = i;
            }
        }
        System.out.print(length + " " + number);
    }

    private static long getChainLength(long number) {
        long result = 0;
        while (number != 1 && number >= 0) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = 3 * number + 1;
            }
            result++;
        }
        return result;
    }
}
