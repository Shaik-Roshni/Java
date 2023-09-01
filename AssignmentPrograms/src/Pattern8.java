
public class Pattern8 {
	public static void main(String[] args) {
	    int size = 5;
	    int alpha = 65;

	    // upper pyramid
	    for (int i=1; i<=5;i++) 
	    {
	      // printing spaces
	      for (int j=5; j>i;j--) 
	      {
	        System.out.print(" ");
	      }
	      // printing alphabets
	      for (int k=0; k<i*2-1;k++)
	      {
	        System.out.print((char)(alpha+k));
	      }
	      System.out.println();
	    }

	    // lower pyramid
	    for (int i=1; i<=5-1;i++) {
	      // printing spaces
	      for (int j=0; j<i;j++) {
	        System.out.print(" ");
	      }
	      // printing alphabets
	      for (int k=0; k<(5-i)*2-1;k++) {
	        System.out.print((char)(alpha+k));
	      }
	      System.out.println();
	    }
	  }
	}

