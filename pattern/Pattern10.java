/* 
1
2*2
3*3*3
3*3*3
2*2
1
*/
class Pattern10
{
        public static void main(String[] args)
	{
                int n=3;
		for(int i=1;i<=n;i++)
		{
                	for(int j=1;j<=i;j++)
			{
                		System.out.print(i);
				if(i!=1 && j!=i)
					System.out.print("*");
        		}
			System.out.println();
        	}
		for(int i=n;i>=1;i--)
		{
                	for(int j=i;j>=1;j--)
			{
                		System.out.print(i);
				if(i!=1 && j!=1) 
					System.out.print("*");	
        		}
			System.out.println();
        	}
	}
}
