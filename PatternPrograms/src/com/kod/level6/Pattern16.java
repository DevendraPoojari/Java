package com.kod.level6;

public class Pattern16 {
	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			for (int j=0;j<=5;j++)
			{
				if(i==j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(0);
				}
			}
			System.out.println();
		}
	}
}
