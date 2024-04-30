
/*
 * Print the palindromic pairs in given string array
  Input : [ “code” , “edoc” , “da” , “d” ] ,
  Output : [code,edoc]
 */

import java.util.*;
public class PalindromicPair {
    public static List<String>tofindresult(String[] words){

        List<String> result = new ArrayList<>();

        for(int i = 0; i < words.length ; i++){

            if(i+1 < words.length){

                String word = words[i+1];

                String curr = "";

                String now = words[i];

                for(int j = word.length()-1 ; j >= 0;j--){

                    curr += word.charAt(j);
                }

                if(now.equals(curr)){
                    result.add(words[i]);
                    result.add(words[i+1]);
                    curr = "";
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] words = new String[n];

        for(int i = 0; i < n ; i++){

            words[i] = sc.nextLine();
        }

        System.out.println(tofindresult(words));

        sc.close();
    }
}
