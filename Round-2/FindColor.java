/*
 *  In MS-Paint, when we take the brush to a pixel and click, the color of the region
 *  of that pixel is replaced with a new selected color. Following is the problem
 *  statement to do this task.
   Given a 2D screen, location of a pixel in the screen and a color, replace color of
    the given pixel and all adjacent same colored pixels with the given color.

Example:
Input:
       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 2, 2, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 0, 1, 0},
                      {1, 1, 1, 2, 2, 2, 2, 0},
                      {1, 1, 1, 1, 1, 2, 1, 1},
                      {1, 1, 1, 1, 1, 2, 2, 1},
                      };
    x = 4, y = 4, newColor = 3
The values in the given 2D screen indicate colors of the pixels.
x and y are coordinates of the brush, newColor is the color that
should replace the previous color on screen[x][y] and all surrounding
pixels with same color.

Output:
Screen should be changed to following.
       screen[M][N] = {{1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 1, 1, 1, 1, 0, 0},
                      {1, 0, 0, 1, 1, 0, 1, 1},
                      {1, 3, 3, 3, 3, 0, 1, 0},
                      {1, 1, 1, 3, 3, 0, 1, 0},
                      {1, 1, 1, 3, 3, 3, 3, 0},
                      {1, 1, 1, 1, 1, 3, 1, 1},
                      {1, 1, 1, 1, 1, 3, 3, 1},
                      };
 */

import java.util.*;

public class FindColor{
    public static void tofindresult(int[][] matrix , int x , int y , int newcolor){

        int prevcolor = matrix[x][y];

        tofind(matrix, x, y, prevcolor, newcolor);
    }
    private static void tofind(int[][] matrix, int x , int y , int prevcolor , int newcolor){

        int m= matrix.length;
        int n = matrix[0].length;

    
        if(x < 0 || x >= m || y >= n || y < 0){
            return;
        }
        

        if(matrix[x][y] != prevcolor || matrix[x][y] == newcolor){
            return;
        }

        matrix[x][y] = newcolor;

        tofind(matrix, x+1, y, prevcolor, newcolor);
        tofind(matrix, x-1, y, prevcolor, newcolor);
        tofind(matrix, x, y+1, prevcolor, newcolor);
        tofind(matrix, x, y-1, prevcolor, newcolor);
    }
    public static void main(String[] args) {
        
        int[][] matrix = {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 0 },
                { 1, 0, 0, 1, 1, 0, 1, 1 },
                { 1, 2, 2, 2, 2, 0, 1, 0 },
                { 1, 1, 1, 2, 2, 0, 1, 0 },
                { 1, 1, 1, 2, 2, 2, 2, 0 },
                { 1, 1, 1, 1, 1, 2, 1, 1 },
                { 1, 1, 1, 1, 1, 2, 2, 1 }
        };
        int x = 4;
        int y = 4;
        int newColor = 3;

        tofindresult(matrix, x, y, newColor);

        for(int[] row : matrix){
            for(int num : row){

                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}