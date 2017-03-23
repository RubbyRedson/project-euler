package highly_divisible_triangular_number;

/**
 * Created by Nick on 3/23/2017.
 */
public class Main {
    public static void main(String[] args) {
        int triangleNumber = 0;
        int count = 1;
        for (int i = 1; count < 500; i++) {
            triangleNumber += i;
            count = getNumberOfFactors(triangleNumber);
        }
        System.out.println(triangleNumber);
    }

    private static int getNumberOfFactors(int triangleNumber) {
        int i = triangleNumber / 2;
        int count = 1;
        while (i > 0) {
            if (triangleNumber % i == 0) count++;
            i--;
        }
        return count;
    }
}
