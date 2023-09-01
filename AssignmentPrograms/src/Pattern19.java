import java.util.Scanner;

public class Pattern19 {
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String which needs to be printed ");

        String input = scan.nextLine();
        System.out.println("** Printing the pattern... **");

        for (int i=1; i<=input.length();i++) 
        { 
            for (int j=input.length(); j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=i*2-1;k >=1;k--)
            {
                System.out.print(input.charAt(i-1));
            }
            System.out.println("");
        }
    }
}
