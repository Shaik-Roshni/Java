
public class Pattern12 {
	public static void main(String[] args) {
        int n=5;
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=1;k<=2*(5-i);k++)
            {   
                
                System.out.print(" ");
            }
             
            // Inner loop3 for the again star printing
            for(int l=1; l<=i; l++) 
            {
                 
                // Printing the star without changing the line
                System.out.print("*");
            }
             
            // Line/Row change
            System.out.println();
        }
         
        // Lower half
        // Outer loop for the line/row change
        for(int i=1;i<=5;i++) {
             
            // Inner loop1 for the star printing
            for(int j=1;j<=i;j++)
        {
                System.out.print("*");
            }
             
            // Inner loop2 for the space printing
            for(int k=1; k<=2*(5-i); k++)
            {
                 
                // Printing the space without changing the line
                System.out.print(" ");
            }
             
            // Inner loop3 for the again star printing
            for(int l=1;l<=i;l++)
            {
                 
                // Printing the star without changing the line
                System.out.print("*");
            }
             
            // Line/Row change
            System.out.println();
        }
    }

}
