package lexicographic_permutations;

import java.util.*;

/**
 * Created by Nick on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        //List<String> permutations = new ArrayList<>();
        int counter = 0;
        Set<Integer> freeDigits = new HashSet<>();
        freeDigits.add(0);
        freeDigits.add(1);
        freeDigits.add(2);
        freeDigits.add(3);
        freeDigits.add(4);
        freeDigits.add(5);
        freeDigits.add(6);
        freeDigits.add(7);
        freeDigits.add(8);
        freeDigits.add(9);
        for (int i = 0; i < 10; i++) {
            freeDigits.remove(i);
            Set<Integer> freeForJ = getFreeDigits(freeDigits, i);
            for (int j : freeForJ) {
                Set<Integer> freeForK = getFreeDigits(freeForJ, j);
                for (int k : freeForK) {
                    Set<Integer> freeForL = getFreeDigits(freeForK, k);
                    for (int l : freeForL) {
                        Set<Integer> freeForM = getFreeDigits(freeForL, l);
                        for (int m : freeForM) {
                            Set<Integer> freeForN = getFreeDigits(freeForM, m);
                            for (int n : freeForN) {
                                Set<Integer> freeForB = getFreeDigits(freeForN, n);
                                for (int b : freeForB) {
                                    Set<Integer> freeForC = getFreeDigits(freeForB, b);
                                    for (int c : freeForC) {
                                        Set<Integer> freeForA = getFreeDigits(freeForC, c);
                                        for (int a : freeForA) {
                                            Set<Integer> freeForD = getFreeDigits(freeForA, a);
                                            for (int d : freeForD) {
                                                String permutation = "" + i + j + k + l + m + n + b + c + a + d;
                                                counter++;
                                                if (counter == 1000000) {
                                                    System.out.println(counter + " " + permutation);
                                                    return;
                                                }
                                                //permutations.add(permutation);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            freeDigits.add(i);
        }
//        System.out.println(permutations.size());
//        Collections.sort(permutations);
//        System.out.println(permutations.get(999999));
//        System.out.println(permutations.get(1000000));
    }

    private static Set<Integer> getFreeDigits(Set<Integer> previous, int digit) {
        Set<Integer> free = new HashSet<>();
        for (Integer i : previous) if (i != digit) free.add(i);
        return free;
    }
}
