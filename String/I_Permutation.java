import java.util.*;
class I_Permutation
{
	public static void main(String[] args)
	{
		String s = "abc";
		permutation(s,0,s.length()-1);
	}
	static void permutation(String s , int l , int r)
	{
		if(l==r)
		{
			System.out.println(s);
			return;
		}
		for(int i=l;i<=r;i++)
		{
			s = interchange(s,l,i);
			permutation(s,l+1,r);
			s = interchange(s,l,i);
		}
	}
	static String interchange(String s , int a ,int b)
	{
		char[] arr = s.toCharArray();
		char temp = arr[a];
		arr[a]  = arr[b];
		arr[b] = temp;
		return String.valueOf(arr);
	}
}