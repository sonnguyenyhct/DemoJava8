package LeetCode;

import java.util.ArrayList;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-123321));
    }
    public static boolean isPalindrome(int x){
        if (x < 0){
            return false;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (x>0){
            arrayList.add(x%10);
            x = x/10;
        }
        for (int i =0; i< arrayList.size(); i++){
            if (!arrayList.get(i).equals(arrayList.get(arrayList.size() - 1 - i))){
                return false;
            }
        }
        return true;

    }
}
