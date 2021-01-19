class H_FindRomain
{
	public static void main(String[] args)
	{
		int num = 1546;
		int[] decimal = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String[] romanSym = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String roman = "";
		if(num>=1 && num<=3999)
		{
			for(int i=0;i<decimal.length;i++)
			{
				while(num >= decimal[i])
				{
					num = num - decimal[i];
					roman = roman + romanSym[i];
				}
			}
			System.out.println(roman);
		} else {
			System.out.println("enter invalid no");
		}
	}
}