package power_digit_sum;

import java.math.BigInteger;

/**
 * Created by Nick on 3/25/2017.
 */
public class Main {
    public static void main(String[] args) {
        BigInteger number = BigInteger.ONE.add(BigInteger.ONE);
        number = number.pow(1000);
        String s = number.toString();

        long sum = 0;
        for (int i = 0; i < s.length(); i++)
            sum += Integer.parseInt(s.charAt(i) + "");

        System.out.println(sum);
    }
}
