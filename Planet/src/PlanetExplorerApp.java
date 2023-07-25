import java.util.Scanner;
public class PlanetExplorerApp {
	public static void main(String []args) {
		  Scanner scan = new Scanner(System.in);
		  PlanetExplorer planetExplorer = new PlanetExplorer();
		  double surfaceArea = planetExplorer.calculateSurfaceArea(3.0);
		  System.out.printf("%.2f",surfaceArea);

		}

	}

