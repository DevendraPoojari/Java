package ShadowingProblem;
import java.util.Scanner;
public class PersonApp {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the ID");
		int id=scan.nextInt();
		System.out.println("Enter the Name");
		scan.nextLine();
		String name=scan.nextLine();
		System.out.println("Enter the Gender");
		String gender=scan.next();
		System.out.println("Enter the Email ID");
		scan.nextLine();
		
		String email_id=scan.nextLine();
		System.out.println("Enter the Phone number");
		long phn_no=scan.nextLong();
		Person p=new Person(id,gender,name,email_id,phn_no);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email_id+" "+p.phn_no);
		p.eat();
		p.sleep();
	}

}
