import java.util.Scanner;
public class Grdae {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=scan.nextInt();
		if(marks<50) 
			System.out.println("D-Grade");
		else if(marks>=50 && marks<60)
			System.out.println("C-Grade");
		else if(marks>=60 && marks<70)
			System.out.println("B-Grade");
		else if(marks>=70 && marks<80)
			System.out.println("A-Grade");
		else
			System.out.println("A+-Grade");
		System.out.println("Congratulations");
	}

}
