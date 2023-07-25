import java.util.Scanner;
public class BiriyaniApp {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter brand");
			String brand=scan.nextLine();
			System.out.println("Enter quantity");
			float quantity=scan.nextFloat();
			System.out.println("Enter cookingTime");
			int cookingTime=scan.nextInt();
			System.out.println("packetCount");
			int packetCount=scan.nextInt();
			scan.nextLine();
			System.out.println("Enter flavor");
			String flavor=scan.nextLine();
			System.out.println("Enter spicyLevel");
			String spicyLevel=scan.nextLine();
			System.out.println("Enter price");
			int price=scan.nextInt();
			Biriyani n=new Biriyani(brand, quantity, cookingTime, packetCount, flavor, spicyLevel, price);
			System.out.println(n.brand+" "+n.quantity+" "+n.cookingTime+" "+n.packetCount+" "+n.flavor+" "+n.spicyLevel+" "+n.price);
			n.openPacket();
			n.cook();
			n.serve();
			
		}
	}

