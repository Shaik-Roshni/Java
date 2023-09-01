import java.util.Scanner;

public class Pattern14 {
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = scan.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        for (int i=1; i<=rows;i++)
        {
            for (int j=1; j<=2*i-1;j++)
            {
                if (i==j)
                {
                    System.out.print(i);
                } 
                else
                {
                    System.out.print("*");
                }
            }
 
            System.out.println();
        }
 
        scan.close();
    }
}
