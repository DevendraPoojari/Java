import java.util.Scanner;

public class BooleanArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	boolean arr[]=new boolean[scan.nextInt()];
	System.out.println("Enter the person name");
	for(int i=0; i<=arr.length-1; i++)
	{
		System.out.println("Enter the person "+i);
		arr[i]=scan.nextBoolean();
	}
	
	for(int i=0; i<=arr.length-1; i++)
	{
		System.out.print("Is the person married : ");
		System.out.println(arr[i]+" ");
	}
}
}
