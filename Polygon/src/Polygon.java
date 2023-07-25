import java.util.Scanner;

public class Polygon {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter sides");
		int sides=scan.nextInt();
		identifyPolygon(sides);
}
	public static void identifyPolygon(int sides)
	{
		switch(sides)
		{
		case 3:System.out.println("TRIANGLE");
		break;
		case 4:System.out.println("QUADRILATERAL");
		break;
		case 5:System.out.println("PENTAGON");
		break;
		case 6:System.out.println("HEXAGON");
		break;
		default:System.out.println("POLYGON");
		break;
	}
	}
}
