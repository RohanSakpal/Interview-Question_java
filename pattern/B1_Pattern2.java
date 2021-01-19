
class B1_Pattern2
{
	public static void main(String[] args)
	{
		int n = 6;
		int rc = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=rc-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			rc++;			
		}	
	}
}