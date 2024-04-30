/*

n = 5;
output:
    * 
   * * 
  * * * 
 * * * * 
* * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

 */


import java.util.*;

public class Diamond{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i < n ; i++){

            int k = n-i-1; //4 , 3,2,1,0

            for(int j = 0; j < k ; j++){

                System.out.print(" ");
            }

            for(int j = 0 ; j < i+1 ; j++){

                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i < n ; i++){

            for(int j = 0 ; j < i ; j++){

                System.out.print(" "); 
            }

            for(int j = n-i ;  j >=1;j--){

                System.out.print("* ");
            }

            System.out.println();
        }
        sc.close();
    }
}