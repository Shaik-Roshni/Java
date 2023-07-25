import java.util.Scanner;
public class HeightsOfPlayers {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the Rows and columns where rowa=no of games.columns=no of players");
	float [][]arr=new float[scan.nextInt()][scan.nextInt()];
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println("enter the height of games "+i+" player"+j);
			arr[i][j]=scan.nextFloat();
		}
	}
	System.out.println("Array contents are...");
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<=arr[i].length-1;j++)
		{
			System.out.println(arr[i][j]+" ");
		}
		System.out.println();
}
}
}
