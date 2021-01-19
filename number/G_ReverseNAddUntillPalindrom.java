class G_ReverseNAddUntillPalindrom
{
	public static void main(String[] args)
	{
		 reverseAndAdd(7325);
	}
	static void reverseAndAdd(int n)
	{
		if(isPali(n))
			System.out.println("no. is already palindrom");
		else
		{
			while(!isPali(n))
			{
				int rev = reverse(n);
				int sum = n + rev;
				System.out.println(n+" + "+rev+" = "+sum);
				n = sum;
			}
		}
	}
	static int reverse(int n)
	{
		int rem = 0;
		int rev = 0;
		while(n != 0)
		{
			rem = n%10;
			rev = rev*10 + rem;
			n = n/10;
		}
		return rev;
	}
	static boolean isPali(int n)
	{	
		int rev = reverse(n);
		if(n == rev)
			return true;
		else
			return false;
	}
}