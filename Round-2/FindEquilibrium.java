
/*
 * Equilibrium index of an array is an index such that the sum of elements at
 * lower indexes is equal to the sum of elements at higher indexes. For example,
 *  in an array A:
Example :
Input: A[] = {-7, 1, 5, 2, -4, 3, 0} [-7,-6,-1,1,-3,0,0]
                                     [0 , 3 ,-1,1, 6,7,0]
Output: 3
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Input: A[] = {1, 2, 3}
Output: -1
 */
import java.util.*;

public class FindEquilibrium {
    public static int findEqualCommon(int[] A){

        int n = A.length;

        int[]leftsum = new int[n];
        int[]rightsum = new int[n];

        leftsum[0] = A[0];
        rightsum[n-1] = A[n-1];

        for(int i = 1 ; i<n ; i++){

            leftsum[i] = leftsum[i-1] + A[i];
            rightsum[n-1-i] = rightsum[n-i]+A[n-i-1]; 
        }

        for(int i = 0; i < n ; i++){

            if(leftsum[i] == rightsum[i]){

                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        System.out.println("Enter the size");

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        System.out.println("Enter the numbers");
        
        int[] nums = new int[size];

        for(int i = 0; i < size ; i++){

            nums[i] = sc.nextInt();
        }

        System.out.println("The equilibrium index is: " + findEqualCommon(nums));

        sc.close();
    }    
}
