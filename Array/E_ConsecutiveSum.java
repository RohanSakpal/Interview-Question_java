class E_ConsecutiveSum
{
	public static void main(String[] args)
	{
		int a[] = {12, 21, 5, 31, 9, 8};
		int n = 45;
		int start = 0;
		int sum = a[0];
		for(int i=1;i<a.length;i++)
		{
			sum = sum+a[i];
			
			while(sum>n && start <= i-1)
			{
				sum= sum-a[start];
				start++;
			}
			if(sum == n)
			{
				for(int j=start;j<=i;j++)
					System.out.print(a[j]+" ");
			}
		}
	}
}