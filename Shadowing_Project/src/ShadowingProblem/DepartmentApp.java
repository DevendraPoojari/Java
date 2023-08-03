package ShadowingProblem;
import java.util.Scanner;
public class DepartmentApp {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the College name");
		String college=scan.nextLine();
		System.out.println("Enter the ID");
		int dept_id=scan.nextInt();
		System.out.println("Enter the Department name");
		scan.next();
		String dept_name=scan.nextLine();
		System.out.println("Enter the Mentor name");
		String mentor=scan.nextLine();
		System.out.println("Enter the Student name");
		String student_name=scan.nextLine();
		System.out.println("Enter the Student ID");
		int student_id=scan.nextInt();
		System.out.println("Enter the Student branch");
		scan.next();
		String student_branch=scan.nextLine();
		System.out.println("Enter the Fees");
		int fees=scan.nextInt();
		System.out.println("Enter the Year");
		int year=scan.nextInt();
		System.out.println("Enter the Phone number");
		long phn_no=scan.nextLong();
		Department d=new Department(college,dept_id,dept_name,mentor,student_name,student_id,student_branch,fees,year,phn_no);
		System.out.println(d.college+" "+d.dept_id+" "+d.dept_name+" "+d.mentor+" "+d.student_name+" "+d.student_id+" "+d.student_branch+" "+d.fees+" "+d.year+" "+d.phn_no);
		d.absent();
		d.present();
	}
}
