import java.util.*;
class GivenNoisPrimeOrNot
{
	public static void main(String[] args)
	{
		int n = 2;
		boolean temp = true;
		if(n<=1)
			temp = false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					temp = false;
					break;
				}
			}
		}
		
		if(temp)
			System.out.println("it is prime");
		else
			System.out.println("It is not prime");
	}
}