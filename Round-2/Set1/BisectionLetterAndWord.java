import java.util.*;

public class BisectionLetterAndWord{

    public static Boolean BisectionLetterAndWord(String letter , String word){

        Map<Character,String> map = new HashMap<Character,String>();

        String[] wordArray = word.split(" ");

        for(int i = 0; i < letter.length() ; i++){

            char ch = letter.charAt(i);

            if(map.containsKey(ch)){

                if(!map.get(ch).equals(wordArray[i])){
                    return false;
                }
            }
            else{
                if(map.containsValue(wordArray[i])){
                    return false;
                }
            }
            map.put(ch , wordArray[i]);
        }
        return true;
    }

    public static void main(String[] args){

        BisectionLetterAndWord bw  = new BisectionLetterAndWord();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the letter :");

        String letter = sc.nextLine();

        System.out.println("Enter the word :");

        String word = sc.nextLine();

        System.out.println(bw.BisectionLetterAndWord(letter , word));
    }
}