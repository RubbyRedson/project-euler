package utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nick on 3/28/2017.
 */
public class Utils {
    public static List<Integer> getAllDivisors(int number) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number / 2 + 1; i++) {
            if (number % i == 0) result.add(i);
        }
        return result;
    }

    public static Integer getDivisorSum(int number) {
        int sum = 0;
        for (int i = 1; i < number / 2 + 1; i++) {
            if (number % i == 0) sum += i;
        }
        return sum;
    }
}
