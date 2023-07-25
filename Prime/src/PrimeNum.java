import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number to check for prime");
		int n=scan.nextInt();
		boolean isPrime=false;
		if(n<2)
		{
			System.out.println("enterd number "+n+" is not prime");
		}
		else {
			for(int i=2;i*i<=n;i++)
			{
				if(n%i!=0)
					isPrime=true;
				break;
			}
			if(isPrime==true)
			{
				System.out.println("enterd number "+n+" is prime ");
			}
			else {
				System.out.println("enterd number "+n+" is not prime");
			}
		}
}
}
