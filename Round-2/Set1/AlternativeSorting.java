//Input  : {1, 2, 3, 4, 5, 6, 7}
//Output : {7, 1, 6, 2, 5, 3, 4} 

import java.util.*;


public class AlternativeSorting{
    public static int[] AlternativeSorting(int[] nums){

        int[] result = new int[nums.length];

        int left =0;
        int right = nums.length-1;
        int index = 0;

        while(left <= right){

            if(left != right){
                result[index++] = nums[right--];
                result[index++] = nums[left++];
            }
            else{
                result[index++] = nums[right--];
            }
        }
        return result;
    }

    public static void main(String[] args){

        int[] nums  = {1, 2, 3, 4, 5, 6, 7};

        int[] sortedResult = AlternativeSorting(nums);

        System.out.print(sortedResult);
    }
}