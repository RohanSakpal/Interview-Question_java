import java.util.*;
class Initial10or20Primeno
{
	public static void main(String[] args)
	{
		int status=1,n=2;   //if prime no after 100 no than n=101
		int sum =0;
		for(int count=1;count<=10;)  //if prime no between 2 no than count=start;count<=end
		{
			for(int j=2;j<=Math.sqrt(n);j++)
			{
				if(n%j==0)
				{
					status=0;
					break;
				}	
			}
			if(status != 0)
			{
				System.out.println(n);
				sum = sum+n;
				count++;
			}
			status = 1;
			n++;
		}
		System.out.println("sum : "+sum); //sum of prime no
	}
}