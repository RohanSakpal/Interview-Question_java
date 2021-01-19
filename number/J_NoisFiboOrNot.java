class J_NoisFiboOrNot
{
	public static void main(String[] args)
	{
		int n = 34;
		int fn = 0;
		int sn = 1;
		int tn = 0;
		while(tn < n)
		{
			tn = fn+sn;
			fn = sn;
			sn = tn;
		}
		if(tn == n)
			System.out.println("no is fibo");
		else
			System.out.println("no is not fibo");
	}
}