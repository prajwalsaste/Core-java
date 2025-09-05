package com.stringprogram;

public class Palindrome {
	public static void main(String[] args) {
		
		
		String name="madam";
		String rev="";
		
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev+=name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
