package com.kodnest.mergeelemts;

import java.util.Scanner;

public class MergeElemetsApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array1 Length");
		int arr1[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr1.length+" of Elements to store in an array");
		for(int i=0;i<=arr1.length-1;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter Array2 Length");
		int arr2[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr2.length+" of Elements to store in an array");
		for(int i=0;i<=arr2.length-1;i++)
		{
			arr2[i]=scan.nextInt();
		}
		int arr3[]=new int[arr1.length+arr2.length];
		MergeTwoArrays.mergingArrays(arr1, arr2, arr3);
	}

}
