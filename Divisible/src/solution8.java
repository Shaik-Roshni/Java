import java.util.Scanner;

public class solution8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n=scan.nextInt();
		printOddDivisibleBy5(n);
	}
	public static void printOddDivisibleBy5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				if(1%5==0)
				{
					System.out.println(i);
				}
			}
		}
	}
}
