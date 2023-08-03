
public class ArmstrongNumber {
	int  armstrongNumber(int n)
	{
		int num=n;
		int sum=0;
		int count=0;
		while(n!=0)
		{
			count=count+1;
			n=n/10;
		}
		n=num;
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+(int)Math.pow(digit,count);
			n=n/10;
		}
		
		return sum;
		
	}
}
