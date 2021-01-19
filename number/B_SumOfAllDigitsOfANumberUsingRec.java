class B_SumOfAllDigitsOfANumberUsingRec
{
	public static void main(String[] args)
	{
		int n = 47862;
		int sum = 0;
		while(n!=0)
		{
			int mod = n%10;
			sum = sum + mod;
			n = n/10;
		}
		System.out.println(sum);
	}	
}


//recursive : 

//public static void sumOfNum(int no)
//	{
//		
//		if(no == 0)
//		{
//			return sum1;
//		}		
//		else
//		{
//			int mod1 = no%10;
//			sum1 = sum1 + mod1;
//			no = no/10;
//			sumOfNum(no);
//		}
//
//		return sum1;
//	}