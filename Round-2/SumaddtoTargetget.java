/*
 * Given a list of numbers and a number k, return whether any two numbers
from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 +
7 is 17.
 */

 import java.util.*;


public class SumaddtoTargetget{
    public static boolean tofindresult(int[] arr , int k){

        int[] temp = new int[arr.length];

        for(int i = 0; i < arr.length ;i++){

            for(int j = 0; j < arr.length ; j++){

                if(arr[i] + arr[j] == k){

                    System.out.println(temp[0] = arr[i]);
                    System.out.println(temp[1] = arr[j]);
                    return true;

                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(tofindresult(arr, k));

        sc.close();
    }
}