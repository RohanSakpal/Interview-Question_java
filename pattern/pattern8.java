/*
1
2 6 
3 7 10 
4 8 11 13
5 9 12 14 15
*/
class pattern8
{
       public static void main(String[] args)
	{
       		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=i;
       			for(int j=1;j<=i;j++)
			{
       				System.out.print(k);
				k = k+n-j;
			}
			System.out.println();
		}
	}
}