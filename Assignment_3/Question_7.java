// WAP to count the number of Vowels and Consonants of a String value


package Assignment_3;

import java.util.ArrayList;

public class Question_7 {

    public static void main(String[] args) {
        String stri = "iNeuron";
        String str = stri.trim().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println("String : '"+stri+"' contains, "+vowels+" Vowels and "+consonants+" Consonants.");
    }
}
