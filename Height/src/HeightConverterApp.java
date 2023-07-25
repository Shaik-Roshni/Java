import java.util.Scanner;
public class HeightConverterApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HeightConverter converter = new HeightConverter();
		double feet = converter.convertInchesToFeet(72.0);
		System.out.printf("%.2f%n",feet);
	}
}

