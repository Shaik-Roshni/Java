import java.util.Scanner;
public class If_Else {
    public static void main(String []args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int num1=scan.nextInt();
			int num2=scan.nextInt();
			if(num1>num2)
			{
				System.out.println("Difference is "+(num2-num1));
		    }
			else
			{
				System.out.println("Difference is "+(num1-num2));
			}
    }
}

	   




