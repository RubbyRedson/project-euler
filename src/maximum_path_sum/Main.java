package maximum_path_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nick on 3/26/2017.
 */
public class Main {
    private static List<Long> sums = new ArrayList<>();
    private static List<String> paths = new ArrayList<>();
    public static void main(String[] args) {
        String triangle = "75\n" +
                "95 64\n" +
                "17 47 82\n" +
                "18 35 87 10\n" +
                "20 04 82 47 65\n" +
                "19 01 23 75 03 34\n" +
                "88 02 77 73 07 63 67\n" +
                "99 65 04 28 06 16 70 92\n" +
                "41 41 26 56 83 40 80 70 33\n" +
                "41 48 72 33 47 32 37 16 94 29\n" +
                "53 71 44 65 25 43 91 52 97 51 14\n" +
                "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

        int grid[][] = new int[15][];
        Node nodes[][] = new Node[15][];
        int i = 0;
        for (String row : triangle.split("\n")) {
            int j = 0;
            String[] numbers = row.split(" ");
            grid[i] = new int[numbers.length];
            nodes[i] = new Node[numbers.length];
            for (String number : numbers) {
                int n = Integer.parseInt(number);
                grid[i][j] = n;
                Node node = new Node();
                node.value = n;
                node.path = n + "";
                nodes[i][j] = node;
                if (i > 0) {
                    if (j == 0) {
                        nodes[i - 1][j].left = node;
                    } else if (j == numbers.length - 1) {
                        nodes[i - 1][j - 1].right = node;
                    } else {
                        nodes[i - 1][j - 1].left = node;
                        nodes[i - 1][j].right = node;
                    }
                }
                j++;
            }
            i++;
        }

//        full(nodes[0][0], 0, "");
//        long max = -1;
//        String path = "";
//        for (int k = 0; k < sums.size(); k++) {
//            if (max < sums.get(k)) {
//                max = sums.get(k);
//                path = paths.get(k);
//            }
//        }
//        System.out.println(max);
//        System.out.println(path);

        dynamic(grid);
    }

    private static void dynamic(int[][] grid) {
        for (int i = grid.length - 1; i > 0; i--) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] > grid[i][j + 1]) {
                    grid[i - 1][j] += grid[i][j];
                } else {
                    grid[i - 1][j] += grid[i][j + 1];

                }
            }
        }
        System.out.println(grid[0][0]);
    }

    private static void greedy(Node node) {
        if (node.left == null && node.right == null) {
            System.out.println(node.path);
            int sum = 0;
            for (String s : node.path.split(" "))
                sum += Integer.parseInt(s);
            System.out.println(sum);
        } else {
            if (node.right == null || node.left.value > node.right.value) {
                node.left.path = node.path + " " + node.left.path;
                greedy(node.left);
            } else {
                node.right.path = node.path + " " + node.right.path;
                greedy(node.right);
            }
        }
    }

    private static void full(Node node, long sum, String path) {
        sum += node.value;
        path += " " + node.value;
        if (node.left == null && node.right == null) {
            sums.add(sum);
            paths.add(path);
        } else {
            if (node.left != null) {
                full(node.left, sum, path);
            }
            if (node.right != null) {
                full(node.right, sum, path);
            }
        }

    }

    static class Node {
        long value;
        Node left;
        Node right;

        String path;

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
