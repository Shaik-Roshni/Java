
public class Pattern10 {
	public static void main(String[] args) {
	    // size of cross, use odd number
	    int size = 5;
	    int alpha = 65;

	    for (int i=0;i<5;i++)
	    {
	      for (int j=0; j<5;j++)
	      {
	        if (i==j || i+j ==5-1) 
	        {
	          System.out.print((char)(alpha+j));
	        }
	        else
	        {
	          System.out.print(" ");
	        }
	      }
	      System.out.println();
	    }
	  }
	}

