package quadratic_primes;

import utils.Utils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Nick on 4/2/2017.
 */
public class Main {
    private static HashSet<Long> primes = new HashSet<>();
    static {
        long i = 72 * 72 + 1000 * 72 + 1000;
        while (i > 0) {
            if (Utils.isPrime(i))
                primes.add(i);
            i--;
        }

    }

    public static void main(String[] args) {
        int resultCount = 0;
        int resultA = 0;
        int resultB = 0;
        for (int a = -1000; a < 1000; a++) {
            System.out.println("Count: " + resultCount + " a: " + resultA + " b: " + resultB);
            for (int b =  -1000; b <= 1000; b++) {
                int count = getConsecutivePrimeCount(a, b);
                if (count > resultCount) {
                    resultCount = count;
                    resultA = a;
                    resultB = b;
                }
            }
        }
        System.out.println("Final count: " + resultCount + " a: " + resultA + " b: " + resultB
                + "\nMultiplication: " + resultA * resultB);
    }

    private static int getConsecutivePrimeCount(int a, int b) {
        int n = 0;
        int count = 0;
        while(true) {
            long number = Math.abs(n*n + a*n + b);
            if (!primes.contains(number)) {
                return count;
            }
            count++;
            n++;
        }
    }


//    public static void main(String[] args) {
//        Set<Integer> setA = new HashSet<>();
//        for (int a = 1; a < 1000; a++) {
//            setA.add(a);
//            setA.add(-a);
//        }
//        Set<Integer> setB = new HashSet<>();
//        for (int b = 1; b <= 1000; b++) {
//            setB.add(b);
//            setB.add(-b);
//        }
//        int n = 0;
//        while (setA.size() >= 1 && setB.size() >= 1) {
//            iterate(n, setA, setB);
//            if (setA.size() == 1 && setB.size() == 1) {
//                System.out.println(n + " " + setA + " " + setB);
//                for (int a : setA)
//                    for (int b : setB)
//                        System.out.println(a * b);
//            }
//            n++;
//        }
//    }
//
//    private static void iterate(int n, Set<Integer> setA, Set<Integer> setB) {
//        System.out.println(setA.size() + " " + setB.size());
//        Set<Integer> newA = new HashSet<>();
//        Set<Integer> newB = new HashSet<>();
//        for (int a : setA) {
//            for (int b : setB) {
//                long number = Math.abs(n * n + n * a + b);
//                if (primes.contains(number)) {
//                    newA.add(a);
//                    newB.add(b);
//                }
//            }
//        }
//
//        if (newA.size() <= 3 && newB.size() <= 3) {
//            System.out.println("n is " + n);
//            for (int a : setA) System.out.println("A:" + a);
//            for (int b : setB) System.out.println("B:" + b);
//        }
//
//        setA.clear();
//        setB.clear();
//
//        setA.addAll(newA);
//        setB.addAll(newB);
//
//
//    }
}
