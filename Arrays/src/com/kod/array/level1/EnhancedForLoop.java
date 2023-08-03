package com.kod.array.level1;

import java.util.Scanner;

public class EnhancedForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+arr.length+" elements to store in an array");
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		System.out.println("Array Contents Are....");
		for (int i : arr) 
		{
			i=i+5;
			System.out.print(i+" ");
			
		}

	}

}
