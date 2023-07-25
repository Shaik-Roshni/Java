import java.util.Scanner;

public class FactorsOfNumbers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the number to find Factor");
	int n=scan.nextInt();
	int factors=1;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
	
		System.out.println(i);
	}
}
}
}

