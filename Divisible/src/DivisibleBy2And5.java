import java.util.Scanner;

public class DivisibleBy2And5 {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the Number");
			int n=scan.nextInt();
			displayDivisibleBy2And5(n);
		}
			public static void displayDivisibleBy2And5(int n)
			{
				for(int i=0;i<=n;i++)
				{
					if(i%2==0)
					{
					if(i%5==0)
					{
						System.out.println(i);
					}
				}
			
			
		}
	}

}

