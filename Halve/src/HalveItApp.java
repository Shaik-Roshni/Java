import java.util.Scanner;
public class HalveItApp {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double half = HalveIt.halveTheNumber(150.0);
        System.out.printf("%.2f%n",half);

}
}
