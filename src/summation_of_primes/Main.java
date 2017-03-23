package summation_of_primes;

import java.math.BigInteger;

/**
 * Created by Nick on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        long sum = 2;
        for (int i = 3; i < 2000000; i+=2) {
            if (new BigInteger(i + "").isProbablePrime(5))
                sum += i;
        }
        System.out.println(sum);
    }
}
