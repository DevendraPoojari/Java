package com.kod.level6;

public class Pattern6 {

	public static void main(String[] args) {
		for(int i=1; i<=7;i++)
		{
			for(int j=7-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
