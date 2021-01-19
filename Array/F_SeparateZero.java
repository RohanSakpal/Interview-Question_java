import java.util.*;
class F_SeparateZero
{
	public static void main(String[] args)
	{
		zeroFromLast(new int[] {12, 0, 7, 0, 8, 0, 3});
		zeroFromStart(new int[] {12, 0, 7, 0, 8, 0, 3});
	}
	static void zeroFromLast(int[] a)
	{
		int count =0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count] = a[i];
				count++;
			}
		}
		while(count < a.length)
		{
			a[count] = 0;
			count++;
		}
		System.out.println(Arrays.toString(a));
	}
	static void zeroFromStart(int[] a)
	{
		int count =a.length-1;
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]!=0)
			{
				a[count] = a[i];
				count--;
			}
		}
		while(count >= 0)
		{
			a[count] = 0;
			count--;
		}
		System.out.println(Arrays.toString(a));
	}
}