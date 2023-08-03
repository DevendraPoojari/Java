import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		if(n<2)
		{
			System.out.println("Enter Numbre "+n+" is not a Prime");
		}
		else
		{
			boolean isPrime=true;
			for(int i=2;i*i<=n;i++)
			{
				if (n%i!=0)
				{
					isPrime=false;
					break;
				}
				
			}
			if (isPrime==true)
			{
				System.out.println("Entered Number "+n+" is a Prime");
			}
			else
			{
				System.out.println("Entered Number "+n+" is Not a Prime");
			}
		}
		
		

		
	}
	

}
