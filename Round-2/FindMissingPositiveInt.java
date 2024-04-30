/*
 * 3.Given an array of integers, find the first missing positive integer in linear
time and constant space. In other words, find the lowest positive integer that
does not exist in the array. The array can contain duplicates and negative
numbers as well.
For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should
give 3.
 */

import java.util.*;


public class FindMissingPositiveInt{
    public static int tofindresult(int[] arr){

        Set<Integer> set = new HashSet<>();

        for(int num : arr){

            if(num > 0){

                set.add(num);
            }
        }

        for(int i = 1 ; i <= arr.length+1 ; i++){

            if(!set.contains(i)){

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(tofindresult(arr));

        sc.close();
    }
}




