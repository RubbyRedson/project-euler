package factorial_digit_sum;

import java.math.BigInteger;

/**
 * Created by Nick on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 2; i <= 100; i++)
            factorial = factorial.multiply(new BigInteger(i + ""));

        int sum = 0;
        for (int i = 0; i < factorial.toString().length(); i++) {
            sum += Integer.parseInt(factorial.toString().charAt(i) +"");
        }
        System.out.println(sum);
    }
}
