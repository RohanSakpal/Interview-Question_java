import java.util.*;
class C_SecLargest
{
	public static void main(String args[])
	{
		int a[] = {50,60,79,57,94,56,77};
		int fir = Integer.MIN_VALUE;
		int sec = Integer.MIN_VALUE;
		if(a.length < 2)
			System.out.println("there is no sec largest elem");
		
		for(int i=0;i<a.length;i++)
		{			
			if(a[i]>fir)
			{
				sec = fir;
				fir = a[i];
			}
			else if(a[i]>sec && a[i]!=fir)
			{
				sec = a[i];
			}
		}
		if(sec == Integer.MIN_VALUE)
			System.out.println("no sec ele");
		else
			System.out.println("sec ele : "+sec);
	}
}