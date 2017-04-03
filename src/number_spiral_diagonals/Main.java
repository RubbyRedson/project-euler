package number_spiral_diagonals;

import utils.Utils;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Created by Nick on 4/3/2017.
 */
public class Main {
    private static final int SIZE = 1001;
    public static void main(String[] args) {
        long[][] grid = new long[SIZE][SIZE];

        int x = (SIZE - 1) / 2;
        int y = (SIZE - 1) / 2;
        long counter = 1;
        Direction direction = Direction.RIGHT;

        do {
            grid[x][y] = counter;
            counter++;
            direction = getDirection(grid, x, y, direction);
            switch (direction) {
                case UP:
                    y++;
                    break;
                case DOWN:
                    y--;
                    break;
                case LEFT:
                    x--;
                    break;
                case RIGHT:
                    x++;
                    break;
            }
        } while (x < SIZE && y < SIZE && x >= 0 && y >= 0 && direction != null);

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (i == j || Math.abs(SIZE - 1 - j) == i) sum = sum.add(new BigInteger(grid[i][j] + ""));
            }
        }
        System.out.println(sum);
    }

    private static Direction getDirection(long[][] grid, int x, int y, Direction direction) {
        if (x == (SIZE - 1) / 2 && y == (SIZE - 1) / 2) return Direction.RIGHT;
        if (direction == Direction.RIGHT) {
            if (x == SIZE) return null;
            if (grid[x][y - 1] == 0) return Direction.DOWN;
            else return Direction.RIGHT;
        }
        if (direction == Direction.DOWN) {
            if (y == SIZE - 1 || grid[x - 1][y] == 0) return Direction.LEFT;
            else return Direction.DOWN;
        }
        if (direction == Direction.LEFT) {
            if (x == 0 || grid[x][y + 1] == 0) return Direction.UP;
            else return Direction.LEFT;
        }
        if (direction == Direction.UP) {
            if (y == 0 || grid[x + 1][y] == 0) return Direction.RIGHT;
            else return Direction.UP;
        }
        return null;
    }

    enum Direction {RIGHT, DOWN, LEFT, UP}
}
