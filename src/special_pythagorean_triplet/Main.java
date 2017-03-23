package special_pythagorean_triplet;

/**
 * Created by Nick on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        for (c = 1; c < 1000; c++)
            for (b = 1; b < c; b++)
                for (a = 1; a < b; a++) {
                    if (a + b + c == 1000) {
                        if (a * a + b * b == c * c) {
                            System.out.println(a * b * c);
                            return;
                        }
                    }
                }
    }
}
