package com.kod.level6;

public class Pattern24 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++)
			{
				if(j==1 || j==(i*2)-1|| i==5)
				{
				System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
