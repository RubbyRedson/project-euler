package number_letter_counts;

/**
 * Created by Nick on 3/25/2017.
 */
public class Main {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i < 1000; i++) {
            sum += computeNumber(i);
        }
        System.out.println(sum + 11);
    }

    private static int computeNumber(int i) {
        if (i <= 20) {
            System.out.println(numberToString(i));
            return numberToString(i).length();
        } else {
            if (i < 100) {
                int rightDigit = i % 10;
                System.out.println(numberToString(i - rightDigit) + " " + numberToString(rightDigit));
                return numberToString(i - rightDigit).length()
                        + numberToString(rightDigit).length();
            } else {
                int right = i % 10;
                int middle = i % 100 - right;
                int left = i - middle - right;


                if (middle + right == 0) {
                    System.out.println(numberToString(left));
                    return numberToString(left).length();
                }
                else if (middle + right <= 20) {
                    System.out.println(numberToString(left) + " " + numberToString(middle + right));
                    return numberToString(left).length() + numberToString(middle + right).length() + 3;
                } else {
                    System.out.println(numberToString(left) + " and " + numberToString(middle) +  " " + numberToString(right));
                    return numberToString(right).length()
                            + numberToString(middle).length() + numberToString(left).length() + 3;
                }

            }
        }
    }

    private static String numberToString(int number) {
        switch (number) {
            case 0: return "";
            case 1: return "one"; 
            case 2: return "two"; 
            case 3: return "three"; 
            case 4: return "four"; 
            case 5: return "five"; 
            case 6: return "six"; 
            case 7: return "seven"; 
            case 8: return "eight"; 
            case 9: return "nine"; 
            case 10: return "ten"; 
            case 11: return "eleven"; 
            case 12: return "twelve"; 
            case 13: return "thirteen"; 
            case 14: return "fourteen"; 
            case 15: return "fifteen"; 
            case 16: return "sixteen"; 
            case 17: return "seventeen"; 
            case 18: return "eighteen"; 
            case 19: return "nineteen"; 
            case 20: return "twenty"; 
            case 30: return "thirty"; 
            case 40: return "forty"; 
            case 50: return "fifty"; 
            case 60: return "sixty"; 
            case 70: return "seventy"; 
            case 80: return "eighty"; 
            case 90: return "ninety"; 
            case 100: return "onehundred"; 
            case 200: return "twohundred"; 
            case 300: return "threehundred"; 
            case 400: return "fourhundred"; 
            case 500: return "fivehundred"; 
            case 600: return "sixhundred"; 
            case 700: return "sevenhundred"; 
            case 800: return "eighthundred"; 
            case 900: return "ninehundred";
        }
        return null;
    }
}
