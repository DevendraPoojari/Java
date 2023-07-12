package sat;
import java.util.Scanner;
public class Mathematics {
public static void main(String[] args) {
	int sub= subtraction(20,5);
	System.out.println(sub);
	int mul=multiplication(4,5);
	System.out.println(mul);
	double div=division(20,4);
	System.out.printf("%.2f\n",div);
	int rem=remainder(10,3);
	System.out.println(rem);
}
	public static int subtraction(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	public static double division(int num1,int num2)
	{
		return num1/num2;
	}
	public static int remainder(int num1,int num2)
	{
		return num1%num2;
	}
}
