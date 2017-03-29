package reciprocal_cycles;

/**
 * Created by Nick on 3/29/2017.
 */
public class Main {
    public static void main(String[] args) {
        int sequenceLength = 0;

        for (int i = 1000; i >= 7; i--) {
            if (sequenceLength >= i) {
                break;
            }

            int[] foundRemainders = new int[i];
            int position = 0;
            int val = 1;

            while (val > 0 && foundRemainders[val] == 0) {
                foundRemainders[val] = position;
                val = val * 10;
                val = val % i;
                position++;
            }

            if (position - foundRemainders[val] > sequenceLength) {
                sequenceLength = position - foundRemainders[val];
                System.out.println("1/" + i + " has cycle of length " + sequenceLength);
            }
        }
        System.out.println(sequenceLength);
    }
}
