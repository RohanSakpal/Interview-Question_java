import java.util.*;
class I_removeDupFromArrWithoutColl
{
	public static void main(String[] args)
	{
		removeDup(new int[] {15, 21, 11, 21, 51, 21, 11});
	}
	static void removeDup(int[] a)
	{	int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i] == a[j])
				{
					a[j] = a[n-1];
					j--;
					n--;
				}
			}
		}
		int temp[] = Arrays.copyOf(a,n);
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");		
		}
	}
}