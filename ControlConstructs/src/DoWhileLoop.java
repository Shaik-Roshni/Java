import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int pageno=100;
		boolean board=true;
		int i=1;
		do
		{
			System.out.println("Kodwoman read page"+i);
			i++;
			System.out.println("Do you want to continue ?");
			board=scan.nextBoolean();
		}while(board);
			
		}
	}


