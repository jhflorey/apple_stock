package com.javapractice.com;

import java.util.List;
import java.util.ArrayList;

public class ProductOfEveryInteger {

	public static void main(String[] args) {
		int[] array = {1,7,3,4};
		List<Integer> product = new ArrayList<Integer>();
		for(int i = 0; i < array.length; i++){
			int multiplication = 1;
			for(int j = 0; j < array.length; j++){
				int skipValue = array[i];
				if(skipValue != array[j]){
					multiplication = multiplication*array[j];
				}
			}
			product.add(multiplication);
		}
		System.out.println(product);
	}
}
	
	