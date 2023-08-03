import java.util.Scanner;

public class Main

{

public static void identifyCharacter(char ch)

{
	if(Character.isDigit(ch))
	{
		System.out.println("Entered Character "+ch+" Is Digit...");
	}
	else if(!Character.isLetter(ch))
	{
		System.out.println("Entered Character "+ch+" Is Special Character...");
	}
	else
	{
		switch(Character.toLowerCase(ch))
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
					if(Character.isLowerCase(ch))
					{
						System.out.println("Entered Character "+ch+" Is Lower case vowel...");
					}
					else
					{
						System.out.println("Entered Character "+ch+" Is Upper case vowel...");
					}
				break;
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("Entered Character "+ch+" Lower case consonent");
				}
				else {
					System.out.println("Entered Character "+ch+" Upper case consonent");
				}
				break;
		}
	}



}

public static void main(String[] args)

{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a character to check for digit or vowel or consonent");
	char ch=scan.next().charAt(0);
	identifyCharacter(ch);

}

}