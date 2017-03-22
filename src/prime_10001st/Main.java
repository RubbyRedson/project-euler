package prime_10001st;

import java.math.BigInteger;

/**
 * Created by Nick on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        int counter = 1;
        for (int i = 1;; i+=2) {
            if (new BigInteger(i + "").isProbablePrime(15)) {
                counter++;
                if (counter == 10001) {
                    System.out.println(counter + " " + i);
                    return;
                }
            }
        }
    }
}
