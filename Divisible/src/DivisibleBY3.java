import java.util.Scanner;

public class DivisibleBY3 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the Number");
	int N=scan.nextInt();
	displayDivisibleBy3(N);
}
	public static void displayDivisibleBy3(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
		}
	
	
}
}
