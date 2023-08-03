import java.util.Scanner;

public class StringArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String arr[]=new String[10];
		System.out.println("Enter firstname of 10 employees");
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.println("The name of employee "+i);
			arr[i]=scan.next();
		}
		System.out.println("array contents are.....");
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
