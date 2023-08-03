import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Calculator calculator=new Calculator();
		System.out.println("Hello user welcome to kodnest ");
		System.out.println("+ =====> Addition");
		System.out.println("- =====> Subtraction");
		System.out.println("+ =====> Multiplication");
		System.out.println("/ =====> Division");
		System.out.println("% =====> FindRemainder");
		System.out.println("^ =====> FindSquare");
		System.out.println("Enter Your Choice");
		char ch=scan.next().charAt(0);
		
		while(true)
		{
		switch(ch)
		{
		case '+':calculator.Addition();
		break;
		
		case '-':calculator.Subtraction();
		break;
		
		case '*':calculator.Multiplication();
		break;
		case '/':calculator.Division();
		break;
		case '%':calculator.FindRemainder();
		break;
		case '^':calculator.FindSquare();
		break;
		case '!':System.out.println("Tata bye bye see you");
			return;
		default:
			System.out.println("please check the message properly");
		}
	}
	}

}
