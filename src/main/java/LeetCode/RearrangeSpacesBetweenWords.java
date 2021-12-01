package LeetCode;

import java.util.ArrayList;

public class RearrangeSpacesBetweenWords {

    public static void main(String[] args) {
        System.out.println(reorderSpaces(" practice   makes   perfect"));
    }

        public static String reorderSpaces(String text) {
        int countSpace = 0;
        int countWord = 0;
        String word = "";
            for (int i = 0; i< text.length()-1; i++){
                if (text.charAt(i) == ' '){
                    countSpace++;
                }else if (text.charAt(i+1) == ' ' ){
                    countWord++;
                }
                if (text.charAt(i+1) == ' ' && i == text.length()-2){
                    countSpace++;
                }else if(text.charAt(i+1) != ' ' && i == text.length()-2){
                    countWord++;
                }
            }
            for (int i = 0; i< text.length()-1; i++){
                if (text.charAt(i) != ' '){
                    word = word.concat(String.valueOf(text.charAt(i)));
                }else if(text.charAt(i+1) != ' ' && text.charAt(i) != ' '){
                    for(int j = 0; j<countSpace/(countWord-1);j++){
                        word = word.concat(" ");                    }
                }
            }
            for(int j = 0; j<countSpace%countWord;j++){
                word = word.concat(" ");                    }
            return word;
        }
}
