/*
WAP to reverse a sentence while preserving the position.
Input : “Think Twice”
Output : “kniht eciwt”
 */


package Assignment_3;

import java.util.Arrays;

public class Question_2 {

    public static String reverseWord(String str){
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            ans += str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "Think Twice";
        str = str.toLowerCase();
        String[]ans = str.trim().split(" ");
        for(int i=0; i<ans.length; i++){
            ans[i] = reverseWord(ans[i]);
        }
        str = String.join(" ", ans);
        System.out.println(str);
    }
}
