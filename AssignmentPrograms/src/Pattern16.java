import java.util.Scanner;

public class Pattern16 {
	public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
 
        //Taking rows value from the user
 
        System.out.println("How many rows you want in this pattern?");
 
        int rows = scan.nextInt();
 
        System.out.println("Here is your pattern....!!!");
 
        char ch='A';
         
        for (int i=1;i<=rows;i++)
        {
            for (int j=1;j<=i;j++) 
            {
                System.out.print(j);
            }
             
            for (int j=i+1;j<=rows;j++) 
            {
                System.out.print(ch);
            }
            
            ch++;
             
            System.out.println();
        }
        scan.close();
    }
}
