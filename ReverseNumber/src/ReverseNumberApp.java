import java.util.Scanner;

public class ReverseNumberApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		ReverseNumber reverse=new ReverseNumber();
		int res=reverse.reverseNumber(n);
		System.out.println("Reverse of number "+n+" is "+res);

	}

}
