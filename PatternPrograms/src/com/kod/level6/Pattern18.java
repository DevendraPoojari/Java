package com.kod.level6;

public class Pattern18 {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{				
				System.out.print(n+" ");
				n=n+1;
			}
			System.out.println();
		}
	}

}
