import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter 1 or 2 or 3 or 4 or 5 or 6 or 7");
		int week=scan.nextInt();
        switch(week)
        {
        case 1:
        	System.out.println("Chilling Sunday");
        	break;
        case '2':
        	System.out.println(" Boring Monday");
        	break;
        case 3:
        	System.out.println("Frustated Tuesday");
        	break;
        case 4:
        	System.out.println("Headche Wednesday");
        	break;
        case 5:
        	System.out.println("waiting for friday on Thursday");
        	break;
        case 6:
        	System.out.println("Excitment to get weekend on Friday Evening");
        	break;
        case 7:
        	System.out.println("House tension started on Saturday");
        	break;
        	default:
        		System.out.println("Idiot come to office");
        		
        }
	}

}
