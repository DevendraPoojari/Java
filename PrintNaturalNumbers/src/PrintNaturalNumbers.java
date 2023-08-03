import java.util.Scanner;

public class PrintNaturalNumbers {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=0;
		for(int i=0;i<=n;i++)
		{
			count+=i;
		}
		System.out.println(count);
	}

}
