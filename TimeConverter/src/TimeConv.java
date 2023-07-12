
public class TimeConv {

	public static void main(String[] args) {
		
		double res=convertToHours(90);
		System.out.println(res);
	}
	public static double convertToHours(int minutes)
	{
		return minutes/60.0;
	}

}
