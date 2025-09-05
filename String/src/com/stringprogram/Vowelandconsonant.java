package com.stringprogram;
import java.util.*;

public class Vowelandconsonant {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String name=sc.nextLine();
	
		int count=0;
		String vowels="";
		String Consonant="";
		
		for(int i=0;i<name.length();i++)
		{
			count++;
			
			
			if( name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='o' || name.charAt(i)=='u' || name.charAt(i)=='i')
			{
				vowels+=name.charAt(i);
			
			}
			else
			{
				
				Consonant+=name.charAt(i);
				
			}
		}
		System.out.println("vowels in String    ::"+vowels);
		System.out.println("Consonant in string ::"+Consonant);
		System.out.println("count of Charcter   ::"+count);
	}

}
