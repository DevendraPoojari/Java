import java.util.Scanner;
public class SwitchEx {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter any number from 1 to 7");
	int num=scan.nextInt();
	switch(num)
	{
	case 1:
		System.out.println("Super Sunday");
		break;
	case 2:
		System.out.println("Marvelous Monday");
		break;
	case 3:
		System.out.println("Tasty Tuesday");
		break;
	case 4:
		System.out.println("Wonderful Wednesday");
		break;
	case 5:
		System.out.println("Thirsty Thursday");
		break;
	case 6:
		System.out.println("Fabulous Friday");
		break;
	case 7:
		System.out.println("Second Saturday");
		break;
	default:
		System.out.println("Please check the days of Week");
	}
}
}
