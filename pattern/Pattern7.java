/*
1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
*/

class Pattern7
{
	public static void main(String[] args)
	{
                int n=7;
		for(int i=1;i<=n;i++)
		{
                	for(int j=0;j<i-1;j++)
			{
                		System.out.print(" ");
        		}
			for(int j=i;j<=n;j++)
			{
                		System.out.print(j+" ");
        		}
			System.out.println();
        	}
		for(int i=2;i<=n;i++)
		{
                	for(int j=n-i;j>0;j--)
			{
                		System.out.print(" ");
        		}
			for(int j=n-i+1;j<=n;j++)
			{
                		System.out.print(j+" ");
        		}
			System.out.println();
        	}
        }
}