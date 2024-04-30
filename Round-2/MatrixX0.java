import java.util.*;

// n = 6
//m = 7

public class MatrixX0 {
    public static void tofindresult(int n  , int m){

        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < m ; j++){

                if(i == 0 || i == n-1 || j == 0 || j == m-1 ||(i==2 || i ==3 ) && (j == 2 || j ==3) ){

                    System.out.print("X ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int n = 6;
        int m = 7;

        tofindresult( n, m);
    }
}
