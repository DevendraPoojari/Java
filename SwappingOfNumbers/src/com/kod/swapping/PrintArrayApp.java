package com.kod.swapping;

import java.util.Scanner;

public class PrintArrayApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int arr[]=new int[scan.nextInt()];
		for (int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		PrintArray.printArray(arr);
	}

}
