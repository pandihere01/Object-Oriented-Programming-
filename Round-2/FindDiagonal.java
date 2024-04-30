/*
 * Print all diagonals in this way :
ip: {{1,2,3},
     {4,5,6},
     {7,8,9}}

op : {9,8,6,7,5,3,4,2,1}
 */



public class FindDiagonal{
    public static void tofindresult(int[][] matrix){

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int sum = rows + cols -2 ; sum >= 0 ;  sum--){ //4tic ,3tic,2,1,0

            for(int i = 0 ;i <= sum ; i++){ // 4->0,1,2,3,4 , 3->0,1,2,3
 
                int j = sum - i;  // 4-0;4-1,4-2,4-3,4-4 || 3,2,1,0

                if(i < rows && j < cols){ // 2,2 || 

                    System.out.print(matrix[j][i] + " "); //(9,8,6,7,5,3,2,4,1)
                }
            }
        }
    }
    public static void main(String[] args) {
        
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        
        tofindresult(matrix);                   
    }
}