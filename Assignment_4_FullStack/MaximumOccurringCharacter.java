package Assignmnet_4_FullStack;

import java.util.HashMap;

public class MaximumOccurringCharacter {
	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		str = str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		Character cha = str.charAt(0);
		int max = Integer.MIN_VALUE;
		for(Character ch : map.keySet()) {
			if(map.get(ch) > max) {
				max = map.get(ch);
				cha = ch;
			}
		}
		System.out.println(cha);
	}
}
