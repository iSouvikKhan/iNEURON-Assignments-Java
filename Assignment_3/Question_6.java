// WAP to sort a String Alphabetically


package Assignment_3;

import java.util.Arrays;

public class Question_6 {
    public static void main(String[] args) {
        String stri = "bbccdefbbaa";
        String str = stri.trim().toLowerCase();
        char[]charArray = str.toCharArray();
        for(int i=0; i<charArray.length-1; i++){
            for(int j=0; j<charArray.length-1-i; j++){
                if( charArray[j] - 'a' > charArray[j+1] - 'a' ){
                    char temp = charArray[j];
                    charArray[j] = charArray[j+1];
                    charArray[j+1] = temp;
                }
            }
        }
        str = String.valueOf(charArray);
        System.out.println(str);
    }
}
