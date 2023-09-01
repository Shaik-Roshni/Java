
public class Pattern5 {
	public static void main(String[] args) {

	    int size = 5;
	    for (int i=0;i<5; i++)
	    {
	      // print spaces
	      for (int j=0;j<=5;j++)
	      {
	        System.out.print(" ");
	      }
	      // print number
	      int num = 1;
	      for (int k=0; k<2*i+1;k++)
	      {
	        if (i==0 || i==5-1) 
	        {
	          System.out.print(num++);
	        } 
	        else
	        {
	          if (k==0 || k==2*i)
	          {
	            System.out.print(num++);
	          } 
	          else
	          {
	            System.out.print(" ");
	          }
	        }
	      }
	      System.out.println();
	    }
	  }
	}
