package non_abundant_sums;

import utils.Utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Nick on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int number : getAllNotExpressable()) {
            sum += number;
        }
        System.out.println(sum);
    }

    private static Set<Integer> getAllNotExpressable() {
        List<Integer> abundantNumbers = new ArrayList<>();
        Set<Integer> result = new HashSet<>();
        for (int i = 1; i <= 28123; i++) {
            result.add(i);
            if (isAbundantNumber(i)) abundantNumbers.add(i);
        }

        Set<Integer> abundantNumberSums = new HashSet<>();
        for (Integer number : abundantNumbers)
            for (Integer secondNumber : abundantNumbers)
                abundantNumberSums.add(number + secondNumber);

        for (Integer sum : abundantNumberSums)
            result.remove(sum);

        return result;
    }

    private static boolean isAbundantNumber(int i) {
        int sum = 0;
        for (Integer divisor : Utils.getAllDivisors(i))
            sum += divisor;
        return sum > i;
    }


}
