package com.javapractice.com;

import java.util.HashSet;

public class FirstRepeatCharacter {

	public static void main(String[] args) {
		String str = "mama";
		char[] arr = str.toCharArray();
		System.out.println(firstRepeating(arr));
	}
	public static char firstRepeating(char[] str){
		// create an empty hashset
		HashSet<Character> h = new HashSet<>();
		
		// Traverse the input array from left to right
		for(int i = 0; i <= str.length -1; i++){
			char c = str[i];
			
			//If element is already in hash set, update x
			// and then break
			if(h.contains(c)) return c;
			else h.add(c);  // else add element to hash set
		}
		return '\0';
	}
}
