package ShadowingProblem;

public class Department {
	public Department(String college, int dept_id, String dept_name, String mentor, String student_name, int student_id,
			String student_branch, int fees, int year, long phn_no) {
		super();
		this.college = college;
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.mentor = mentor;
		this.student_name = student_name;
		this.student_id = student_id;
		this.student_branch = student_branch;
		this.fees = fees;
		this.year = year;
		this.phn_no = phn_no;
	}
	String college;
	int dept_id;
	String dept_name;
	String mentor;
	String student_name;
	int student_id;
	String student_branch;
	int fees;
	int year;
	long phn_no;
	
	void absent()
	{
		System.out.println(student_name+" Is not attending to the college.....");
	}
	void present()
	{
		System.out.println(student_name+" "+"is coming to the college daily....");
	}

}
