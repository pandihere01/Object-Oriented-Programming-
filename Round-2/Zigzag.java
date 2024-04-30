/*
 * Given a matrix of 2D array of n rows and m coloumns.
 *  Print this matrix in ZIG-ZAG fashion as shown in figure.
 
Example:
Input: 
1 2 3
4 5 6
7 8 9
Output: 
1 2 4 7 5 3 6 8 9
 */

import java.util.*;

public class Zigzag {
    public static void tofindresult(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        int[] result = new int[row * col];

        int cnt = 0;

        for(int i = 0; i < matrix.length ; i++){

            for(int j = 0; j < matrix[0].length ; j++){


                while(i == 0 && j <= matrix.length/2 ; j++){


                    result[cnt] = matrix[i][j];
                    cnt++;
                }

                if(j+1 < matrix[0].length && i== 0){

                    result[cnt] = matrix[j][i];
                }

                while()
            }
        }
    }
}