import java.util.Scanner;

public class Pattern23 {
	public static void main(String[] args)
    {
        
        Scanner  scan = new Scanner(System.in);
        
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scan.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i=1;i<=rows;i++)
        {
            for (int k=i;k>=1;k--)
            {
                System.out.print(k + " ");
            }
            for (int l=2;l<=i;l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        for (int i=rows-1;i>=1;i--)
        {
            for (int k=i;k>=1;k--)
            {
                System.out.print(k + " ");
            }
            for (int l=2;l<=i;l++)
            {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}
