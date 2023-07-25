import java.util.Scanner;

public class PrimeNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number to check for prime");
	int n=scan.nextInt();
	for(int i=2;i<n;i++)
	{
	if(n%i==0)
	{
		System.out.println("Number "+n+" is not prime ");
		return;
	}
} 
	System.out.println("Enterd Number "+n+" is prime ");


}
}
