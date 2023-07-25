import java.util.Scanner;
public class MagzineApp{
		public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter title");
		String title=scan.nextLine();
		System.out.println("Enter author");
		String author=scan.nextLine();
		System.out.println("Enter publisher");
		String publisher=scan.nextLine();
		System.out.println("Enter edition ");
		int edition=scan.nextInt();
		System.out.println("Enter cost");
		long cost=scan.nextLong();
		System.out.println("Enter page");
		int page=scan.nextInt();
		Magzine b=new Magzine(title, author, publisher, edition, cost, page);
		System.out.println(b.title+" "+b.author+" "+b.publisher+" "+b.edition+" "+b.cost+" "+b.page);
		b.open();
		b.close();
		b.turnPage();
		}

	}

