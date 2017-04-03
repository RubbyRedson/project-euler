package utils;

import java.math.BigInteger;
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

    public static boolean isPrime(long number) {
        return new BigInteger(number + "").isProbablePrime(5);
    }

    public static void printGrid(long[][] grid, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }
    }

    public static void printSwitchedGrid(long[][] grid, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(grid[j][i] + " ");
            }
        }
    }

    public static void printGrid(int[][] grid, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
        }
    }
}
