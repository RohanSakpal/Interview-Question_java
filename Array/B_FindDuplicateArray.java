import java.util.*;
class B_FindDuplicateArray
{
	public static void main(String[] args)
	{
		int a[] = {2,3,4,3,5,4};
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			if(hs.contains(a[i]))
				System.out.print(a[i]+" ");
			else
				hs.add(a[i]);
		}
	}
}