import java.util.Scanner;

public class Pattern22 {
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scan.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i=1;i<=rows;i++)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print(" ");
            }

            for (int k=i;k<=rows;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
        for (int i=rows;i>=1;i--)
        {
            for (int j=1;j<i;j++)
            {
                System.out.print(" ");
            }

            for (int k=i;k<=rows;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
