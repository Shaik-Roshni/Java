import java.util.Scanner;
public class IfLoop {
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     int interest = 0;

    
     int principal = sc.nextInt();

     
     int rate = sc.nextInt();

     
     int time = sc.nextInt();

     
     if (rate > 10) {

         
         if (time < 5) {
             interest = (principal * rate * time) / 100;
             System.out.println("Simple Interest: " + interest);
         }
     }
     if (interest == 0)
         System.out.println("Not eligible for a loan, interest = " + interest);
 }
}
