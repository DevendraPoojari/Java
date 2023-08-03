package com.kod.level6;

public class Pattern21 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{			
			for(int j=5;j>=i;j--)				
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(k==1 || i==k || i==5)
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
