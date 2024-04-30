/*
 * Given an array of integers, return a new array such that each element at
index i of the new array is the product of all the numbers in the original array
except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would
be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would
be [2, 3, 6].
 */

import java.util.*;

public class ProductofArray {
    
    public static void tofindresult(int[] arr){

        int n = arr.length;

        int[]leftarr = new int[n];
        int[]rightarr = new int[n];

        leftarr[0] = 1;
        rightarr[n-1]= 1;

        for(int i = 1 ; i < n ; i++){

            leftarr[i] = leftarr[i-1] * arr[i-1];
        }

        for(int i = n-2 ; i >= 0 ; i--){

            rightarr[i] = rightarr[i+1] * arr[i+1];
        }

        int[] result = new int[n];

        for(int i = 0; i < n ; i++){

            result[i] = leftarr[i] * rightarr[i];
        }
        for(int num : result){

            System.out.print(num + " ");
        }
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;  i < n ; i++){

            arr[i] = sc.nextInt();
        }

        tofindresult(arr);
        sc.close();
    }
}
