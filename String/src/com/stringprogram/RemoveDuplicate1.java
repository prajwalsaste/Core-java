package com.stringprogram;



public class RemoveDuplicate1 {
	
	public static void main(String[] args) {
		
		
		String name="prajwalsaste";
		String result="";
		
		
		
		for(int i=0;i<name.length()-1;i++)
		{
			char c=name.charAt(i);
			
			if(result.indexOf(c)==-1)
			{
				result+=c;
			}
			
			
		}
		System.out.println("  Orginal String        :: "+name);
		
		System.out.println(" After remove duplicates ::" +result);
	}

}
