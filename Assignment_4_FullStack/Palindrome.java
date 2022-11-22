package Assignmnet_4_FullStack;

public class Palindrome {
	public static void main(String[] args) {
		String str = "2552";
		int si = 0;
		int ei = str.length()-1;
		while(si++<=ei--) {
			if(str.charAt(si) != str.charAt(ei)) {
				System.out.println("Not a palindrome");
				System.exit(0);
			}
		}
		System.out.println("Is a palindrome");
	}
}
