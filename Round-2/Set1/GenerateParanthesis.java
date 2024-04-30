import java.util.*;

public class GenerateParanthesis{

    public static List<String> GenerateParanthesis(int n){

        List<String> result = new ArrayList<>();

        recursion(result , "" , 0 ,0 , n);

        return result;
    }

    private static void recursion(List<String> result , String temp , int open , int close , int n){

        if(temp.length() == n * 2){

            result.add(temp);
            return;
        }

        if(open < n){

            recursion(result , temp + "(" , open + 1 , close , n);
        }
        if(close < open){
            recursion(result , temp + ")" , open , close + 1 , n); 
        }
    }
    public static void main(String[] args){

        GenerateParanthesis gp = new GenerateParanthesis();

        int n = 3;

        List<String> result = gp.GenerateParanthesis(n);

        System.out.println(result);
    }
}