package com.array;

public class Findlargeno {
	public static void main(String[] args) {
		
		int []arr= {12,32,43,1,55};
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max =arr[i];
			}
		}
		System.out.println(max);
	}

}
