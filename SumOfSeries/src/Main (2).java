

	import java.util.Scanner;
	public class Main {
		public static void calculateSumOfSeries(int n) {
	        double sum=0.0;
		    for (int i=1;i<=n;i++) 
		    {
		        sum+=1.0/i;
		     }
		        System.out.println(sum);
	    }
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter n");
		      int n =scan.nextInt();
		      calculateSumOfSeries(n);
	    }
	}	    
	