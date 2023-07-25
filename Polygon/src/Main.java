import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter sides");
	int sides=scan.nextInt();
	identifyPolygon(sides);
	
}
public static void identifyPolygon(int sides)
{
	if(sides==3)
	{
		System.out.println("TRIANGLE");
	}
		else if(sides==4)
		{
			System.out.println("RECTANGLE");
		}
		else if(sides==5)
		{
			System.out.println("PENTAGON");
		}
		else
		{
			System.out.println("HEXAGON");
		}
	}
}



