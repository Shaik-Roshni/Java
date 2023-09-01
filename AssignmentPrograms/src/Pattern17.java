
public class Pattern17 {
	public static void main(String[] args)
	{
		int alphabet = 65;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print((char)alphabet+" ");
				alphabet++;
			}
			System.out.println();
		}
	}	
}
