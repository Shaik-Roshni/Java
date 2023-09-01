
public class Pattern3 {
	public static void main(String[] args) {
	    int size = 5;
	    for (int i=1; i<=5;i++) 
	    {
	      for (int j=5; j>i;j--) 
	      {
	        System.out.print(" ");
	      }
	      for (int k=0; k<i*2-1;k++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    for (int i=1;i<=5-1;i++)
	    {
	      for (int j=0; j<i;j++)
	      {
	    	  System.out.print(" ");
	      }
	      for (int k=(5-i)*2-1;k>0;k--) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	
	      }

