import java.util.Scanner;

public class Pattern15 {
	 public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	 
	        System.out.println("How many rows you want in this pattern?");
	 
	        int rows = scan.nextInt();
	 
	        System.out.println("Here is your pattern....!!!");
	 
	        for (int i=1;i<=rows;i++)
	        {
	            int num=1;
	             
	            for (int j=1;j<i*2;j++) 
	            {
	                if(j%2==0)
	                {
	                    System.out.print("*");
	                }
	                else
	                {
	                    System.out.print(num);
	                     
	                    num++;
	                }
	                 
	            }
	             
	            System.out.println();
	        }
	 
	        scan.close();
	    }
}
