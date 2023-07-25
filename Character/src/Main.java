import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enterd character to check for digit vowel or consonent");
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}


	public static void identifyCharacter(char ch)

	{
		if(Character.isDigit(ch))
		{
			System.out.println("enterd character "+ch+" Is Digit......");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("entred character "+ch+" Is Special" );
		}
		else
		{
		switch(Character.toLowerCase(ch))
		{
		case'a':
		case'e':
		case'i':
		case'o':
		case'u':
			if(Character.isLowerCase(ch))
			{
				System.out.println("enterd character "+ch+" Is lower case vowel");
			}
			else
			{
				System.out.println("enterd character "+ch+" Is upper case vowel");
			}
			break;
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("enterd character "+ch+" Is lower case consonent");	
				}
				else
				{
					System.out.println("enterd character "+ch+" Is upper case consonent");
				}
		}
		}
		
		}
		}

	

	

	
