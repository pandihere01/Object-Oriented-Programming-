 /*  To print the following pattern
        	    P     M
                 R   A
                  O R
                   G
                  O R
                 R   A
                P     M                   */

//input : PROGRAM                

import java.util.*;

public class ExPattern{
    public static void main(String[] args){

        String word = "PROGRAM";
        int length = word.length();

        // Print the upper part of the pattern
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length * 2 - 1; j++) {
                if (j == i || j == (length * 2 - 2 - i)) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Print the lower part of the pattern
        for (int i = length - 2; i >= 0; i--) {
            for (int j = 0; j < length * 2 - 1; j++) {
                if (j == i || j == (length * 2 - 2 - i)) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    

