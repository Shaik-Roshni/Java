import java.util.Scanner;
public class TimeConverterApp {
	public static void main(String []args) {
		Scanner scan = new Scanner(System.in);
		double hours = TimeConverter.convertToHours(90);
		System.out.println(hours);

}
}
