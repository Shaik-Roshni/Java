
public class DoWhile {
	 public static void main(String[] args) {
	        int i = 2;
	        
	        do {
	            int j = 4;
	            
	            do {
	                System.out.println("i = " + i + ", j = " + j);
	                j++;
	            } while (j <= 8);
	            
	            i++;
	        } while (i <= 3);
	    }
	}

