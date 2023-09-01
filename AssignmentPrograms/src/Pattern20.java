
public class Pattern20 {
	public static void main(String[] args)
	{
		int temp = 1;
		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
		for(int i=1;i<3;i++)
		{
			for(int j=1;j<=i+1;j++)
			{
				System.out.print(temp+" ");
				temp++;
			}
			System.out.println();
		}
	}
}
