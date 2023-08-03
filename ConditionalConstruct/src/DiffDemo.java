import java.util.Scanner;
public class DiffDemo {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int a=scan.nextInt();
	int b=scan.nextInt();
	if(a>b)
	{
		int res=b-a;
		System.out.println("The result of subtraction of 2nd number with 1st number is: "+res);
	}
	else
	{
		int res=a-b;
		System.out.println("The result of subtraction of 1st number with 2nd number is: "+res);
		
	}
	
}
}
