package names_scores;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by Nick on 3/27/2017.
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File names = Paths.get("src/names_scores/names.txt").toFile();
        Scanner scanner = new Scanner(names);
        String namesAsStr = "";
        while (scanner.hasNextLine())
            namesAsStr += scanner.nextLine();

        String[] individualNames = namesAsStr.split(",");
        List<String> unsorted = new ArrayList<>();
        for (String name : individualNames) {
            unsorted.add(name.replace("\"", ""));
        }
        Collections.sort(unsorted);
        System.out.println(unsorted);
        BigInteger score = BigInteger.ZERO;

        for (int i = 0; i < unsorted.size(); i++) {
            String name = unsorted.get(i);
            score = score.add(new BigInteger((i+1) * getScore(name) + ""));
        }

        System.out.println(score);

    }

    private static int getScore(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            result += getScore(str.charAt(i));
        }
        return result;
    }
    private static int getScore(char c) {
        int temp_integer = 64;
        return c - 64;
    }
}
