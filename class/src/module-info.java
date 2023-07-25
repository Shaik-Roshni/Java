class program
{
	public static void main(String[]args)
	{
		int n=251;
		int s=n*n;
		int count=0;
		while(n==0)
		{
			if(n/10!=0)
			{
				count=1;
			}
			n=n/10;
			s=s/10;
		}
		count=1;
		System.out.println(s);
			}
		}
	