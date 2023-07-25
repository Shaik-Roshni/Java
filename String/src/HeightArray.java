import java.util.Scanner;
public class HeightArray {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	float arr[]=new float[7];
	System.out.println("enter the array elements");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println("enter the height of player"+i);
		arr[i]=scan.nextFloat();
	}
	System.out.println("Array contents are...");
	for(int i=0;i<=arr.length-1;i++)
	{
		System.out.println(arr[i]+" ");
}
}
}
