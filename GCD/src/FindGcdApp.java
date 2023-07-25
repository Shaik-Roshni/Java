import java.util.Scanner;

public class FindGcdApp {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter 2 Numbers to find GCD");
	int m=scan.nextInt();
	int n=scan.nextInt();
	  FindGcd gcd=new FindGcd();
	int res= gcd.findGcd(m,n);
	System.out.println("the GCD of the above two numbers are : "+res);
}

}

