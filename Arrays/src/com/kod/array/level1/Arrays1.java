package com.kod.array.level1;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the "+arr.length+" elements to store in an array");
		for (int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array Contents are....");
		System.out.println("The positive numbers of an array are");
		for(int i:arr)
		{
			
			if(i>0)
			{
				
				System.out.print(i+" ");
			}
		}

	}

}
