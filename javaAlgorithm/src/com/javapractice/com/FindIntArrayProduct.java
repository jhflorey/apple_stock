package com.javapractice.com;

import java.util.Arrays;

public class FindIntArrayProduct {

	public static void main(String[] args) {
		int[] array = {1,7,3,4};
		productExceptSelf(array);
	}
	
	public static void productExceptSelf(int[] array){
		int[] product = new int[array.length];
		
		for(int i=0; i<array.length; i++){
			product[i] = 1;
			for(int j =0; j<array.length; j++)
				if(j != i) product[i] *= array[j];
		}
		System.out.println(Arrays.toString(product));
	}	
}
