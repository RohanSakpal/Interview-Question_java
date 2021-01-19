import java.util.*;
class A_EqualityOfArr
{
	public static void main(String[] args)
	{
		int a[] = {2,3,4,5,7};
		int b[] = {2,3,4,5,6};
		Boolean check = true;
		if(a.length != b.length)
		{
			check = false;
		}
		else {
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					check = false;
					break;
				}
			}
		}

		if(check == true)
			System.out.println("both arrays are equal");
		else
			System.out.println("both arrays are not equal");
	}
}

//2nd method
//System.out.println(Arrays.equals(s1, s2));  

//3rd method
//If you want to compare two arrays which have same number of elements and same set of elements but in different positions, then first sort both arrays using Arrays.sort() method and then compare using Arrays.equals() method.

//4th method
//If you are checking multidimensional arrays for equality,
//System.out.println(Arrays.equals(s1, s2));      