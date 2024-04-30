//Input  : ((abc)((de))
//Output : ((abc)(de))

import java.util.*;

public class RemoveUnbalancedPara {
    public static String removeUnbalancedParentheses(String input) {

        StringBuilder result = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        for(int i = 0 ; i < input.length() ; i++){

            char ch = input.charAt(i);

            if(ch == '('){

                stack.push(i);
            }
            else if(ch == ')'){

                if(!stack.isEmpty()){

                    stack.pop();
                }
                else{
                    continue;
                }
            }
            result.append(ch);
        
        }

        while(!stack.isEmpty()){

            int index = stack.peek();

            result.deleteCharAt(index);
        
        }
        return result.toString();
    }
    public static void main(String[] args){

        String input = "((ab) cd ((dsf))";

        String result = removeUnbalancedParentheses(input);

        System.out.println(result);
    } 
}
