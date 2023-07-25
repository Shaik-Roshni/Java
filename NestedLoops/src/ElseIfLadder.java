import java.util.Scanner;
public class ElseIfLadder {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter percentage");
	float per = scan.nextFloat();
	if(per>=70)
	{
	System.out.println("Distinction");
	}else if(per>=60)
	{
	System.out.println("First Class");
	}else if(per>=50)
	{
	System.out.println("Second Class");
	}else if(per>=40)
	{
	System.out.println("Pass");
	}
	else
	{
	System.out.println("Failed");
	}
	}
}


		



