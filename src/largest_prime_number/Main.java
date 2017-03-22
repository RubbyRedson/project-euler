package largest_prime_number;

import java.math.BigInteger;

/**
 * Created by Nick on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        long prime = 600851475143l;
        for (long i =  prime / 2; i > 1; i = i - 2)
            if (prime % i == 0) {
                BigInteger factor = new BigInteger(i + "");
                if (factor.isProbablePrime(3)) {
                    System.out.println(i);
                    break;
                }
            }
    }
}
