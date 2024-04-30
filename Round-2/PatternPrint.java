
//input = 3

import java.util.*;


public class PatternPrint {
    
    public static void tofindresult(int n){

        int top = 0;
        int bottom = n-1;

        int left = 0;
        int right = n-1;

        int[][] matrix = new int[n][n];

        int m = 1;

        while(true){

            for(int i = top , h = 0 ; i <= bottom ; i++ , h++){

                int k = top + h;

                matrix[k][i] = m;

                m++;
            }
            bottom--;

            left++;

            if(bottom < top || (left > right)){
                break;
            }

            for(int i = bottom ; i >= top ; i--){

                matrix[i][right] = m;
                m++;
            }
            right--;

            if(right < left || bottom < top){
                break;
            }

            for(int i = right ; i >= left ; i--){

                matrix[top][i] = m;
                m++;
            }

            top++;
            left++;
            bottom--;

            if(bottom < top || left > right){
                break;
            }
        }

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n ; j++){

                if(matrix[i][j] != 0){

                    System.out.print(matrix[i][j] + "  ");
                }
                else{

                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n  = sc.nextInt();

        tofindresult(n);

        sc.close();
    }
}
