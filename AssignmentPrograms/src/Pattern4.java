
public class Pattern4 {
	public static void main(String[] args) {
	    int size = 6;
	    for (int i=6/2;i<6;i+=2) 
	    {
	    	//print first spaces
	      for (int j=1;j<6-i;j+=2)
	      {
	        System.out.print(" ");
	      }
	      //print first stars
	      for (int j=1;j<i+1;j++)
	      {
	        System.out.print("*");
	      }
	      //print second spaces
	      for (int j=1;j<6-i+1;j++) 
	      {
	        System.out.print(" ");
	      }
	      //print second stars
	      for (int j=1; j<i+1;j++) {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	    // lower part
	    // inverted pyramid
	    for (int i=6;i>0;i--) 
	    {
	      for (int j=0;j<6-i;j++)
	      {
	        System.out.print(" ");
	      }
	      for (int j=1;j<i*2;j++)
	      {
	        System.out.print("*");
	      }
	      System.out.println();
	    }
	  }
	}

