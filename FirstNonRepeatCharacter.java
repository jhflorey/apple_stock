package com.javapractice.com;

import java.util.HashMap;

public class FirstNonRepeatCharacter {

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		char[] arr = str.charArray();
		System.out.println(firstNonRepeating(arr));
	}
	public static char firstNonRepeating(String word){
		HashMap<Character, Integer> h = new HashMap<>();
		for(int i = 0; i <= word.length(); i++){
			char c = word.charAt(i);
			if(h.containsKey(c)){
				h.put(c, h.get(c) + 1);
			} else {
				h.put(c, 1);
			}
		}
		// since HashMap doesn't maintain order, going through string again
		for(int i = 0; i < word.length(); i++){
			char c = word.charAt(i);
			if(h.get(c) == 1){
				return c;
			}
		}
		throw new RuntimeException("Undefined behavior");
	}

}
