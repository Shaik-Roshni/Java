import java.util.Scanner;

public class Pattern25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows to print the pattern ");
		int rows = scan.nextInt();
		for (int i=1; i<=rows;i++) 
		{
			System.out.print("@");
			for (int j=1; j<=i;j++) {
				System.out.print((i*2)-1+ " ");
			}
			System.out.println();
		}
	}
}
