package com.kod.level6;

public class Pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0+i;j<=5;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}