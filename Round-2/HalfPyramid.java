/*
 * int n = 5
 * 
 * output:
 *          1
 *       2  3  2
 *     3 4  5  4  3
 *   4 5 6  7  6  5  4
 * 5 6 7 8  9  8  7  6 5
 * 
 * 
 */

import java.util.*;


public class HalfPyramid {
    public static void tofindresult(int n){

        for(int i = 1; i <=n ; i++){

            for(int j = n-i ; j >=0 ; j--){

                System.out.print("  ");
            }

            for(int j = i ; j <= 2*i-1 ; j++){

                System.out.print(j+" ");
            }

            for(int j = 2*i-2 ; j >= i ; j--){

                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int n = 5;

        tofindresult(n);
    }
}
