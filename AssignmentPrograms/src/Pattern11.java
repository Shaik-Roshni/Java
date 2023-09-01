
public class Pattern11 {
	public static void main(String[] args) {
        
        int n = 5;
  
        for (int i=0; i<5;i++) {
            int number = 1;
            System.out.printf("%" +(5-i)*2+ "s", "");
            for (int j =0;j<=i;j++) {
                System.out.printf("%4d", number);
                number = number*(i-j)/(j+1);
            }
            System.out.println();
        }
  
    }
}
