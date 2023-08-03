package com.kodnest.searcharray;

import java.util.Scanner;


public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length");
		int arr[]=new int[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		int key=scan.nextInt();
		Search search=new Search();
		if(search.isPresent(arr,key))
		{
			System.out.println("Element Found");
		}
		else
		{
			System.out.println("Element Not Found");
		}
			

	}

}