package com.kod.level6;

public class Pattern14 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<2*i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<2*i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println();
		}

	}

}
