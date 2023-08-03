package com.kod.swapping;

import java.util.Scanner;

public class SwappingOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		int x=scan.nextInt();
		int y=scan.nextInt();
		int z;
		System.out.println("Swapping of "+x+" and "+y+" are..");
		z=x;
		x=y;
		y=z;
		System.out.println(x);
		System.out.println(y);

	}

}
