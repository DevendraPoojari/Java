package com.kodnest.training;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[][][]=new int[scan.nextInt()][][];
		for (int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter 2D length for 1D "+i);
			arr[i]=new int[scan.nextInt()][];
			for (int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter 3D length for 1D "+i+"and for 2D "+j);
				arr[i][j]=new int[scan.nextInt()];
			}
		}
		
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				for (int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.println("Enter the marks of school "+i+"class "+j+"Student "+k);
					arr[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Array contents are....");
		
		for (int i=0;i<=arr.length-1;i++)
		{
			for (int j=0;j<=arr[i].length-1;j++)
			{
				for (int k=0;k<=arr[i][j].length-1;k++)
				{
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println("-----------");
		}
		

	}

}
