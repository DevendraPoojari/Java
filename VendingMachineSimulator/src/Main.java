import java.util.Scanner;

public class Main

{

public static void getProduct(String productCode)

{

	switch(productCode)
	{
	case "p01":
		System.out.println("COCA COLA");
		break;
	case "p02":
		System.out.println("THUMS UP");
		break;
	case "p03":
		System.out.println("SPRITE");
		break;
	default:
		System.out.println("BHINDU JAL JEERA");
		break;
	}

}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter Product code");
	String code=scan.next();
	getProduct(code);
}

}
