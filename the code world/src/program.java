class program {
	
	public static void main(String[]args)
	{
		int arr[]={1,2,3,4,5};
		sum s=new sum();
		System.out.print("sum=");
		int res=s.findSum(arr);
		System.out.println(res);
	}
	}
	class sum

{
	private int sum=0;
	private int finfsum(int a[])
	{
		for(int i=1;i<=a.length-1;i=i+2)
		{
			sum+=a[i];
		}
		return sum;
	}
}
	