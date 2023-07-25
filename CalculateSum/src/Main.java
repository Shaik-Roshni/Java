

	import java.util.Scanner;
	public class Main {
	    public static void calculateSumOfDigits(int n) {
	        int sum=0;
	        while(n!=0) 
	        {
	            sum+=n%10;
	            n/=10;
	        }
	        System.out.println("Sum of Digits : " +sum);
	    }
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("Enter An Integer To Calculate Sum Of Digits");
	        int n = scan.nextInt();
	        calculateSumOfDigits(n);
	    }
	}

