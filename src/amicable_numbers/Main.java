package amicable_numbers;

import java.util.HashMap;
import java.util.Map;

import static utils.Utils.getDivisorSum;

/**
 * Created by Nick on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> sums = new HashMap<>();
        for (int i = 1; i < 10000; i++) {
            sums.put(i, getDivisorSum(i));
        }

        int sum = 0;
        int values = 0;
        for (Integer key : sums.keySet()) {
            int value = sums.get(key);
            if (key != value && key.equals(sums.get(value))) {
                System.out.println(key + " " + value);
                sum+=key;
                values += value;
            }
        }
        System.out.println(sum);
    }


}
