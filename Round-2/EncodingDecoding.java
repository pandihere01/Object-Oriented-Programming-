/*
 * 
 * 4.Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count
the number of ways it can be decoded.
For example, the message '111' would give 3, since it could be decoded as
'aaa', 'ka', and 'ak'.
You can assume that the messages are decodable. For example, '001' is not
allowed.
 */

import java.util.*;

public class EncodingDecoding {
    public static int tofindresult(String s){

        HashMap<Integer , Integer> map = new HashMap<>();

        return decodeHelper(s, 0, map);
    }
    private static int decodeHelper(String s , int index , HashMap<Integer , Integer> map){

        if(s.length() == index){
            return 1;
        }

        if(s.charAt(0) == '0'){
            return 0;
        }

        if(map.containsKey(index)){

            return map.get(index);
        }

        int ways = decodeHelper(s, index+1, map);

        if(index+ 1 < s.length() && Integer.parseInt(s.substring(index , index + 2)) <= 26){

            ways += decodeHelper(s, index+2, map);
        }

        map.put(index, ways);
        return ways;
    }
    
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        String word = sc.nextLine();

        System.out.println(tofindresult(word));

        sc.close();
    }
}
