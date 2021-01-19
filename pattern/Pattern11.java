/*
3
44
555
6666
555
44
3
*/


class Pattern11
{
        public static void main(String[] args)
	{
                int a=3,n=4;
		for(int i=1;i<=2*n-1;i++)
		{	if(i<=n) {
                		for(int j=1;j<=i;j++)
				{
                			System.out.print(a);
        			}
				a++;
				System.out.println();
			} else {
				a--;
				for(int j=1;j<=2*n-i;j++)
				{	
                			System.out.print(a);
        			}
				System.out.println();
			}
        	}
	}
}


