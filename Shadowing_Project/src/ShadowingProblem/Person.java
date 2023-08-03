package ShadowingProblem;

public class Person {
	public Person(int id, String gender,String name, String email_id, long phn_no) {
		super();
		this.id = id;
		this.gender = gender;
		this.name=name;
		this.email_id = email_id;
		this.phn_no = phn_no;
	}
	int id;
	String gender;
	String email_id;
	String name;
	long phn_no;


void eat() {
	System.out.println(name+" Is Eating....");
}
void sleep() {
	System.out.println(gender+" "+name+" Is Sleeping");
}
}// assignment 2 programs with 10 attributes

