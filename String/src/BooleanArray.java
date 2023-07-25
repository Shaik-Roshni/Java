import java.util.Scanner;
public class BooleanArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter people count");
	 int n=scan.nextInt();
	boolean arr[]=new boolean[n] ;
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("Is person "+i+" Married ?");
		arr[i]=scan.nextBoolean();
	}
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(" person "+i+" Married "+arr[i]);
}
}
}
