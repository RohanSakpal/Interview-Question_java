/*In case of an Armstrong number of 3 digits, the sum of cubes of each digit is equal to the number itself. For example: 153 = 1*1*1 + 5*5*5 + 3*3*3 // 153 is an Armstrong number.
*/

class A_Amstrong
{
	public static void main(String[] args)
	{
		amstrong(153);
		amstrong(1674);
	}
	public static void amstrong(int n)
	{
		int sum =0;
		int copy = n;
		int len = String.valueOf(n).length();
		while(n!=0)
		{
			int mul = 1;
			int digit = n%10;
			for(int i=0;i<len;i++)
			{
				mul = mul*digit;
			}
			sum = sum + mul;
			n = n/10;
		}
		if(sum == copy)
			System.out.println("no is amastrong");		
		else
			System.out.println("no is not amastrong");
	}
}
