/*
 * input= [1,1,2,2,2,4,5,5,5,10,22]
 */

import java.util.*;

public class CountFrequency {
    
    public static void tofindresult(int[] arr){

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int num : arr){

            map.put(num , map.getOrDefault(num , 0 )+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){

            int key = entry.getKey();
            int value = entry.getValue();


            if(value > 1){

                System.out.println(key + "--> " + value);
            }
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n  ; i++){
            arr[i] = sc.nextInt();
        }

        tofindresult(arr);

        sc.close();
    }
}
