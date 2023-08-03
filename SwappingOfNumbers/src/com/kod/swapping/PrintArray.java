package com.kod.swapping;

public class PrintArray  {
	public static void printArray(int arr[])
	{
		System.out.println("Forward Array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Backward Array is");
		for (int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
	}
}
