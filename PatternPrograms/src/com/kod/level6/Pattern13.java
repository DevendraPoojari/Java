package com.kod.level6;

public class Pattern13 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<2*i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}
