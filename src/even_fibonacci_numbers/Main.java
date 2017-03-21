package even_fibonacci_numbers;

/**
 * Created by Nick on 3/21/2017.
 */
public class Main {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int sum = 0;
        while (i < 4000000 && j < 4000000) {
            int tmp = i;
            i = i + j;
            j = tmp;
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}
