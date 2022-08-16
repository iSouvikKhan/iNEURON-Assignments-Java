// WAP to check if the String is Anagram or not.


package Assignment_3;

import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {
        String string1 = "anagram";
        String string2 = "nagaram";

        String str1 = string1.trim().toLowerCase();
        String str2 = string2.trim().toLowerCase();

        char[]strArray1 = str1.toCharArray();
        char[]strArray2 = str2.toCharArray();

        Arrays.sort(strArray1);
        Arrays.sort(strArray2);

        String strr1 = new String(strArray1);
        String strr2 = new String(strArray2);

        if(strr1.equals(strr2)){
            System.out.println("String : '"+string1+"' and String : '"+string2+"' is a valid Anagram.");
        }else{
            System.out.println("String : '"+string1+"' and String : '"+string2+"' is an Invalid Anagram.");
        }
    }
}
