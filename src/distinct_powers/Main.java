package distinct_powers;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nick on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Set<BigInteger> powers = new HashSet<>();
        for (int a = 2; a < 101; a++)
            for (int b = 2; b < 101; b++)
                powers.add(new BigInteger(a + "").pow(b));

        System.out.println(powers.size());
    }
}
