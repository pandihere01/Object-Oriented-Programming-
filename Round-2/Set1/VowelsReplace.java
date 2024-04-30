//input : hello
//output : holle

//input : zoho corporation
//output: zohi carporotoon


import java.util.*;

public class VowelsReplace{

    public static String VowelsReplace(String word){

        int left = 0;
        int right = word.length()-1;

        char[] charArray = word.toCharArray();

        while(left < right){

            if(isVowel(charArray[left]) && isVowel(charArray[right])){

                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            else if(!isVowel(charArray[left])){
                left++;
            }
            else if(!isVowel(charArray[right])){
                right--;
            }
        }
        
        String result = "";

        for(int i = 0; i < charArray.length ; i++){

            result += charArray[i];
        }
        return result;
    }

    public static boolean isVowel(char chr){
        if(chr=='a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the words: ");

        String word = sc.nextLine();

        System.out.println(VowelsReplace(word));
    }
}