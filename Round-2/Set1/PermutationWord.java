//input = bca
//output = 4

import java.util.*;

public class PermutationWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");

        String word = sc.nextLine();

        int result = countOfPermutation(word);

        System.out.println("result is " + result);
    }

    public static int countOfPermutation(String word) {

        char[] firstform = word.toCharArray();
        Arrays.sort(firstform);

        int[] count = {0};

        generatePermutation(new String(firstform), word, count);

        return count[0];
    }

    public static void generatePermutation(String remaining, String target , int[] count) {

        if (remaining.equals(target)) {
            count[0]++;
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            String nextRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
            String nextTarget = target.substring(1);

            if (nextRemaining.compareTo(target) <= 0) {
                count[0]++;
                generatePermutation(nextRemaining, nextTarget, count);
            }
        }    
    }
}
