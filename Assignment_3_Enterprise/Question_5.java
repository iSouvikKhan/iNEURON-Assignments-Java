// WAP to print repeatedly occurring characters in the given String.


package Assignment_3;

import java.util.ArrayList;

public class Question_5 {
    public static void main(String[] args) {
        String stri = "iNEuRonIneuRONneuronI";
        String str = stri.trim().toLowerCase();
        int[]arr = new int[256];
        ArrayList<Character> charArray = new ArrayList<Character>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int index = ch - 'a';
            arr[index] += 1;
            if(arr[index] == 2){
                charArray.add(ch);
            }
        }
        if(charArray.size() == 0){
            System.out.print("String : '"+stri+"' doesn't have any repetitive character.");
        }else{
            System.out.println("The repetitive characters are,-");
            System.out.println(charArray);
        }
    }
}
