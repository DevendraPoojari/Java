package com.kodnest.training;

import java.util.Scanner;

public class TwoDimenstionalArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float arr[][]=new float[scan.nextInt()][scan.nextInt()];
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
				System.out.println("Enter the heights of game "+i+" palyer "+j);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Array contents are....");
		for(int i=0; i<=arr.length-1;i++)
		{
			for(int j=0; j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
