package lattice_paths;

/**
 * Created by Nick on 3/25/size17.
 */
public class Main {
    public static void main(String[] args) {
        int size = 21;

        long[][] grid = new long[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = 1;
            }
        }

        for (int i = size - 2; i >= 0; i--) {
            for (int j = size - 2; j >= 0; j--) {
                grid[i][j] = grid[i + 1][j] + grid[i][j + 1];
            }
        }
        System.out.println(grid[0][0]);
    }
}
