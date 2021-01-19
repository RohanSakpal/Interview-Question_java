import java.util.*;
class F_ReverseStrButPreserveSpace
{
	public static void main(String[] args)
	{
		String str = "i am not string";
		char[] ch = str.toCharArray();
		char[] rev = new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == ' ')
				rev[i] = ch[i];
		}
		int last = ch.length -1;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] != ' ')
			{
				if(rev[last] == ' ')
				{
					last--;
				}
				rev[last] = ch[i];
				last--;
			}
		}
		System.out.println(String.valueOf(rev));
	}
}