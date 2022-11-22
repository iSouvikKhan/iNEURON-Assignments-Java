package Assignmnet_4_FullStack;

import java.util.HashMap;

public class PrintDuplicates {

	public static void main(String[] args) {
		String str = "GeeksForGeeks";
		str = str.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0)+1);
		}
		
		System.out.println(map);
		str = "";
		for(Character ch : map.keySet()) {
			if(map.get(ch) > 1) {
				str += ch;
			}
		}
		System.out.println(str);
		
	}
}
