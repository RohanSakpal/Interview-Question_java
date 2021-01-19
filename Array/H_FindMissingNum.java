class H_FindMissingNum
{
	public static void main(String[] args)
	{
		int n = 8;
		int a[] = {1,4,3,5,7,6,8};
		int sumofarr = 0;

		int sumofn = (n*(n+1))/2;

		for(int i=0;i<a.length;i++)
		{
			sumofarr = sumofarr + a[i];
		}

		int missingno = sumofn - sumofarr;
		System.out.println("misiing no is : "+missingno);
	}
}