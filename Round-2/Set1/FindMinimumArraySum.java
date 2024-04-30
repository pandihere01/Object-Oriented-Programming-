//Array : {2, 3, 7, ­1, 8, 5, 11} 
//output : {{2­>3, 3­>5, 7­>8, ­1­>2, 8­>11, 5­>7, 11­>}}

import java.util.*;

public class FindMinimumArraySum{

    public static List<String> FindMinimumArraySum(List<Integer> nums){

        List<String> result = new ArrayList<String>();
    
        for(int i = 0; i < nums.size()-1 ; i++){

            int current = nums.get(i);

            int next = nums.get(i+1);

            if(current > next){

                result.add(current + "<" + next);
            }
            else{
                result.add(current + ">" + next);
            }
        }
        return result;    
    }

    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(2, 3, 7, 1, 8, 5, 11);

        System.out.println(FindMinimumArraySum(nums));
    }
}