/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
*/
class Pattern5
{
	public static void main(String[] args)
	{
		int n=7;
		int count =0;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i-1;j++)
			{
				System.out.print("0");
			}
			System.out.print(count);
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("0");
			}
			System.out.println();
			count++;
		}
	}
}