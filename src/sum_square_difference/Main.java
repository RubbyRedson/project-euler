package sum_square_difference;

/**
 * Created by Nick on 3/22/2017.
 */
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int squaredSum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
            squaredSum = i*i + squaredSum;
        }
        System.out.println(sum*sum - squaredSum);
    }
}
