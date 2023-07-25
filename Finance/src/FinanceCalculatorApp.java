import java.util.Scanner;
public class FinanceCalculatorApp {
	public static void main(String []args) {
		 Scanner scan = new Scanner(System.in);
		 FinanceCalculator calculator = new FinanceCalculator();
		 double interest = calculator.calculateSimpleInterest(1000.0, 0.05, 2.0);
		 System.out.printf("%.2f%n", interest);
		}
}
