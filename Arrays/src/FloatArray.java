
import java.util.Scanner;

public class FloatArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float arr[]=new float[7];
		System.out.println("Enter heights of 7 players");
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.println("height of the player "+i);
			arr[i]=scan.nextFloat();
		}
		System.out.println("array contents are.....");
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
