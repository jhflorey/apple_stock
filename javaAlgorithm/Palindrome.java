package com.javapractice.com;

public class Palindrome {

	public static void main(String[] args) {
		String str = "XAZYX";
		boolean result = isPalindrome(str);
		System.out.println(result);	
	}
	public static boolean isPalindrome(String str){
		
		if(str.length() == 0 || str.length() == 1) return true;
		else{
			int left = 0, right = str.length()-1;
			while(left <= right){
				if(str.charAt(left) != str.charAt(right)){
					return false;
				}else{
					
					if(str.charAt(left) == str.charAt(right)){
						left++;
						right--;
					}
				}
				
			}
			return true;
		}

	}
}
