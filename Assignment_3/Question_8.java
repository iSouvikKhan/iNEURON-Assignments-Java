// WAP to count number of special characters


package Assignment_3;

public class Question_8 {
    public static void main(String[] args) {
        String stri = "nAw!!@@jkf123*&#$%";
        String str = stri.trim().toLowerCase();
        int special = 0;
        int others = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9'){
                others++;
            }else{
                special++;
            }
        }
        System.out.println("String : '"+stri+"' contains, "+special+" Special characters.");
    }
}
