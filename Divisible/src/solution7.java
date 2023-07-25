import java.util.Scanner;

public class solution7 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter n");
	int n=scan.nextInt();
	printEvenDivisibleBy2And3(n);
}
public static void printEvenDivisibleBy2And3(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
		{
			if(1%3==0)
			{	
				System.out.println(i);
			}
			
		}
	}
}
}

