import java.util.Scanner;
public class StringArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String arr[]=new String[10];
	System.out.println("enter Array elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter the name of employee"+i);
		arr[i]=scan.next();
	}
	System.out.println("Array contents are....");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]+" ");
	}
}
}
