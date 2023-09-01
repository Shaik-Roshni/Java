
public class Pattern24 {
	public static void main(String[] args)
    {
        String str = "I Like Very Much Java";
        String[] strArr = str.split(" ");
        
        for(int i=0;i< strArr.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(strArr[j]+" ");
            }
           System.out.println();
        }
    }
}
