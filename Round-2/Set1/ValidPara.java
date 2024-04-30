//Input  : (a+b)(a*b)
// Output : Valid

//  Input  : (ab)(ab+)
//Output : Invalid

//Input  : ((a+b)
//Output : Invalid 

import java.util.*;

public class ValidPara{
    public static String ValidPara(String word){

        Stack<Character> stack = new Stack<>();

        for(char ch : word.toCharArray()){

            if(ch == '('){

                stack.push(ch);
            }
            else if(ch == ')'){

                if(stack.isEmpty()){
                    return "Invalid";
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return "Valid";
        }
        return "Invalid";
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word :");

        String word = sc.nextLine();

        System.out.println(ValidPara(word));
    }
}