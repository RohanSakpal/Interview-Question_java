class D_CheckBInary
{
	public static void main(String[] args)
	{
		int num = 101100010;
		Boolean isBinary = true;
		while(num!=0)
		{
			int n = num % 10;
			if(n > 1 )
			{
				isBinary = false;
				break;
			}
			else
			{
				num = num/10;
			}
		}
		if(isBinary)
			System.out.println("It is binary num");
		else
			System.out.println("It is not Binary num");
	}
}