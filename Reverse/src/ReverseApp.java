import java.util.Scanner;

public class ReverseApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a Number to Reverse");
	int n=scan.nextInt();
	Reverse reverseNumber=new Reverse();
	int rev=reverseNumber.reverseNumber(n);
	System.out.println("Reverse of Number "+n+" is +rev");
	if(n==rev)
	{
		System.out.println("Entered Number "+n+" is Palindrome");
		
	}
	else
	{
		System.out.println("Entered Number "+n+" is  not Palindrome");	
	}
}
}
