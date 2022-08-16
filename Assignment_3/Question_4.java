// WAP to check if the String is a Pangram or not


package Assignment_3;

public class Question_4 {

    public static Boolean isPangram(char ch){
        if( !Character.isLetter(ch) ){
            return false;
        }
        return true;
    }

    public static void repetitiveCode(String str){
        System.out.print("String : '"+str+"' is an Invalid pangram.");
        System.exit(0);
    }

    public static void main(String[] args) {
        String stri = "AbcDefghijKlmNopQrstuVWxyz";
        String str = stri.trim().toLowerCase();
        if(str.length() != 26){
            repetitiveCode(stri);
        }
        Boolean[]arr = new Boolean[26];
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(isPangram(ch)){
                arr[ch - 'a'] = true;
            }else{
                repetitiveCode(stri);
            }
        }
        for(int i=0; i<arr.length; i++){
            if( ! arr[i] ){
                repetitiveCode(stri);
            }
        }
        System.out.print("String : '"+stri+"' is a Valid pangram.");
    }
}
