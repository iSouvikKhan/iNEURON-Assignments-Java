package Assignmnet_4_FullStack;

import java.util.HashMap;

public class Consonants_Vowels_and_SpecialCharacters {
	public static void main(String[] args) {
		String str = "Geeks#ForG@eeks%";
		str = str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		int vowels = 0;
		int consonants = 0;
		int specialCharacters = 0;
		for(Character ch : map.keySet())
		{
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowels++;
			else if(ch > 97 && ch <= 122)
				consonants++;
			else
				specialCharacters++;
		}
		System.out.print("Vowels : "+vowels+"\nConsonants : "+consonants+"\nSpecial Characters : "+specialCharacters);
	}
}
