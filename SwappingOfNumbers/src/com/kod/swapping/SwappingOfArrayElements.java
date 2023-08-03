package com.kod.swapping;

import java.util.Scanner;

public class SwappingOfArrayElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents are....");
		for (int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Enter two indexes between the length of array for Swapping ");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int help;
		help=arr[x];
		arr[x]=arr[y];
		arr[y]=help;
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
	}
}
