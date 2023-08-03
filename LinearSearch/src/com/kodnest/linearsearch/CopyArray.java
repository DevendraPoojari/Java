package com.kodnest.linearsearch;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" Elements to store in an array");
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int arr1[]=new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++)
		{
			arr1[i]=arr[i];
				
		}
		System.out.println("Array 1 Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array 2 Contents are...");
		for(int i=0;i<=arr1.length-1;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
	}

}
