package com.kodnest.sumofarray;

import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" Elements to store in an array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		FindSum findsum=new FindSum();
		int sum=findsum.findSum(arr);
		System.out.println("Array sum is "+sum);

	}

}
