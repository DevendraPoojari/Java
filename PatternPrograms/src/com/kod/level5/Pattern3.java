package com.kod.level5;

public class Pattern3 {
public static void main(String[] args) {
	for(int i=0;i<3;i++)
		{
			for(int j=0;j<3-i-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=0;k<2*i+1;k++)
			{
				if(i==0||i==3-1)
				{
					System.out.print("* ");
				}
				else
				{
					if(k==0||k==2*i)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	
	}
}
