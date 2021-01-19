import java.util.*;
class C_FindRepetativeNNonRepHashMap
{
	public static void main(String[] args)
	{
		String s = "javaconceptoftheday";
		char[] ch = s.toCharArray();
		HashMap<Character , Integer> hm = new HashMap<Character , Integer>();

		for(char c : ch)
		{
			if(hm.containsKey(c))
				hm.put(c,hm.get(c)+1);
			else
				hm.put(c,1);
		}
		for(char c : ch)
		{
			if(hm.get(c)==1)
			{
				System.out.println("non repeted : "+c);
				break;
			}
		}
		for(char c : ch)
		{
			if(hm.get(c)>1)
			{
				System.out.println("first repeted : "+c);
				break;
			}
		}
	}
}