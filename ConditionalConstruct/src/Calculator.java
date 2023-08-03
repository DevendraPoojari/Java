import java.util.Scanner;

public class Calculator {
	Scanner scan=new Scanner(System.in);
	public void Addition(){
		System.out.println("Enter 2 numbers for Addition");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Addition of "+a+" and "+b+"is "+(a+b));
	}
	public void Subtraction(){
		System.out.println("Enter 2 numbers for Subtraction");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Subtraction of "+a+" and "+b+"is "+(a-b));
	}
	public void Multiplication(){
		System.out.println("Enter 2 numbers for Multiplication");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Multiplication of "+a+" and "+b+"is "+(a*b));
	}
	public void Division(){
		System.out.println("Enter 2 numbers for Division");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Division of "+a+" and "+b+"is "+(a/b));
	}
	public void FindRemainder(){
		System.out.println("Enter 2 numbers for FindRemainder");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("Remainder of "+a+" and "+b+"is "+(a%b));
	}
	public void FindSquare(){
		System.out.println("Enter 2 numbers for FindSquare");
		int a=scan.nextInt();
		System.out.println("Square of "+a+"is "+(a*a));
	}

}
