import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a number greater than 100");
	int n=scan.nextInt();
	if(n>100)
	{
		printNumbers(n);
	}
	else
	{
		System.out.println("please return and write a number");
	}
}
public static void printNumbers(int n)
{
	
	for(int i=0;i<=n;i++)
	{
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
	}
}

	
	


