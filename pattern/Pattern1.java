class Pattern1
{
        public static void main(String[] args)
	{
                int n=7;
		for(int i=1;i<=n;i++)
		{
                	for(int j=1;j<=i;j++)
			{
                		System.out.print(j);	
        		}
			System.out.println();
        	}
		for(int i=n-1;i>0;i--)
		{
			for(int j=1;j<=i;j++)
			{
                		System.out.print(j);	
        		}
			System.out.println();
		}
        }
}

/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/