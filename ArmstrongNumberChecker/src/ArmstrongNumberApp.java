import java.util.Scanner;

public class ArmstrongNumberApp {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		ArmstrongNumber armstrongnumber=new ArmstrongNumber();
		int res=armstrongnumber.armstrongNumber(n);
		System.out.println(res);

	}

}
