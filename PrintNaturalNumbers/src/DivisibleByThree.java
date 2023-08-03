
import java.util.Scanner;

public class DivisibleByThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++) 
			if (i%3==0)
			{
				System.out.println(i);
			}
		}
}		
	