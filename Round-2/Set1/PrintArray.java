/*You’re given an array. Print the elements of the array which are greater 
than its previous elements in the array. Input : 2, -3, -4, 5, 9, 7, 8 
 Output: 2 5 9You should solve this question in O(n) time. */

 import java.util.*;

 public class PrintArray{

    public static void greaterValue(int[] nums){

        if(nums.length == 0){
            return;
        }

        System.out.print(nums[0] + " ");

        for(int i = 1 ; i < nums.length-1 ; i++){

            if(nums[i] > nums[i-1]){

                System.out.print(nums[i]+" ");
            }
        }
    }
    public static void main(String[] args){

        int[] nums = {2,-1,-4,5,9,7,8};

        greaterValue(nums);
    }
 }