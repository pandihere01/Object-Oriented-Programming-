//input => [[1,2,3] , [4,5,6] , [7,8,9]]           //[[1,2,3],
                                                    //[4,5,6],
                                                    //[7,8,9]]
                                                  
//output => [[7,4,1] , [8,5,2] , [9,6,3]]

import java.util.*;

public class RotateMatrix{
    public static int[][] RotateMatrix(int[][] matrix){      

        int n = matrix.length;

        for(int i = 0; i < n ; i++){  // i = 0 , 1, 2
            for(int j = i ; j < n ; j++){  //j = 0,1,2
                
                int temp = matrix[i][j];            //now => [[1,4,7]
                                                    //        [2,5,8]
                matrix[i][j] = matrix[j][i];        //        [3,6,9]]
                matrix[j][i] = temp;
            }
        }

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n / 2 ; j++){

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }
        return matrix; 
    }

    public static void PrintMatrix( int[][] matrix){
        for(int i=0; i < matrix.length ; i++){
            for(int j=0; j < matrix[0].length ;j++){
                System.out.println(matrix[i][j]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args){

        int[][] matrix = {{1,2,3} , {4,5,6} , {7,8,9}};

        System.out.println(RotateMatrix(matrix));
    }
}

