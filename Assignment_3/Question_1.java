/*
WAP to reverse a String.
Input: “iNeuron”
Output: “norueNi”
 */


package Assignment_3;

public class Question_1 {
    public static void main(String[] args) {
        String str = "iNeuron";
        str = str.trim();
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            ans += str.charAt(i);
        }
        System.out.print(ans);
    }
}
