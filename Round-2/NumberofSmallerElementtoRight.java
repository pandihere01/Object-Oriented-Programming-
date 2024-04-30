/*
 * Find number of smaller elements to the right
 Input : { 3, 4, 9, 6, 1}
Output : {1,1,2,1,0}
 */

import java.util.*;

public class NumberofSmallerElementtoRight {
    public static List<Integer> tofindresult(int[] arr){

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < arr.length ; i++){

            int count = 0;

            for(int j = i+1 ; j < arr.length ; j++){

                if(arr[j] < arr[i]){

                    count++;
                }
                else{
                    continue;
                }
            }
            result.add(count);
            count = 0;
        }
        return result;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        System.out.print(tofindresult(arr));
        sc.close();
    }
}
