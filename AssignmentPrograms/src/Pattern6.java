
public class Pattern6 {
	public static void main(String[] args) {
	    int size = 5, num = 1;
	    // upside pyramid
	    for (int i=1;i<=5;i++)
	    {
	      // printing spaces
	      for (int j=5;j>i;j--)
	      {
	        System.out.print(" ");
	      }
	      // printing number
	      for (int k=0;k<i*2-1;k++) 
	      {
	        if (k==0 || k==2*i-2)
	        {
	          System.out.print(num++);
	        } 
	        else
	        {
	          System.out.print(" ");
	        }
	      }
	      // set the number to 1
	      num = 1;
	      System.out.println();
	    }
	    // downside triangle
	    for (int i=1;i<5;i++)
	    {
	      // printing spaces
	      for (int j=0;j<i;j++)
	      {
	        System.out.print(" ");
	      }
	      // printing number
	      for (int k=(5-i)*2-1;k>=1;k--) 
	      {
	        if (k==1 || k==(size-i)*2-1) 
	        {
	          System.out.print(num++);
	        } 
	        else
	        {
	          System.out.print(" ");
	        }
	      }
	      // set the number to 1
	      num = 1;
	      System.out.println();
	    }
	  }
	}

