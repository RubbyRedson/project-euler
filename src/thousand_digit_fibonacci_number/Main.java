package thousand_digit_fibonacci_number;

import java.math.BigInteger;

/**
 * Created by Nick on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        long index = 2;
        BigInteger firstNum = BigInteger.ONE;
        BigInteger secondNum = BigInteger.ONE;
        while (!hasThousandDigits(secondNum)) {
            index++;
            BigInteger temp = secondNum.add(BigInteger.ZERO);
            secondNum = secondNum.add(firstNum);
            firstNum = temp;
        }
        System.out.println(index);
    }

    private static boolean hasThousandDigits(BigInteger secondNum) {
        return secondNum.toString().length() >= 1000;
    }
}
