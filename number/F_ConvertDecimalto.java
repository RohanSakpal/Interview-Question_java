class F_ConvertDecimalto
{
	public static void main(String[] args)
	{
		decimalToBinary(50);
		decimalToOctal(1000);
		decimalToHexadeci(2000);
	}
	static void decimalToBinary(int n)
	{
		String binary = "";
		while(n>0)
		{
			int rem = n%2;
			binary = rem + binary;
			n = n/2;
		}
		System.out.println("Binary no of 50 : "+binary);
	}
		
	static void decimalToOctal(int n)
	{
		String octal = "";
		while(n>0)
		{
			int rem = n%8;
			octal = rem + octal;
			n = n/8;
		}
		System.out.println("Octal no of 1000 : "+octal);
	}

	static void decimalToHexadeci(int n)
	{
		String hexa = "";
		char[] ch = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(n>0)
		{
			int rem = n%16;
			hexa = ch[rem] + hexa;
			n = n/16;
		}
		System.out.println("Octal no of 2000 : "+hexa);
	}
}