/*
 * 5.This problem was asked by Airbnb.

Given a list of integers, write a function that returns the largest sum of non-
adjacent numbers. Numbers can be 0 or negative.

For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1,
1, 5] should return 10, since we pick 5 and 5.
Follow-up: Can you do this in O(N) time and constant space?
 */

import java.util.*;

public class AdjecentGreatest {
    
    public static int tofindresult(int[] arr){

        int odd_greatest = 0;
        int even_greatest = 0;
        int adjacent = 0;

        if(arr.length > 3){

            adjacent = arr[0] + arr[arr.length-1];

        }
        for(int i = 0; i < arr.length ; i+=2){

            odd_greatest+= arr[i];

            if(i+1 < arr.length){

                even_greatest += arr[i + 1];
            }
        }

        int curr = Math.max(adjacent , odd_greatest);

        return Math.max(curr , even_greatest);
    }
    public static void main(String[] args) {
        
        int[] arr = {2,4,6,2,5};

        System.out.println(tofindresult(arr));
    }
}
