import java.util.*;
class C_FindDuplicateChar
{
	public static void main(String[] args)
    	{
       		duplicateCharCount("JavaJ2EE");
		System.out.println();
       		duplicateCharCount("Better Butter");
    	}
	public static void duplicateCharCount(String str)
	{
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] ch = str.toCharArray();
		for(char c : ch)
		{
			if(hm.containsKey(c))
				hm.put(c,hm.get(c)+1);
			else
				hm.put(c,1);
		}

		Set<Character> st = hm.keySet();
		for(char c : st)
		{
			if(hm.get(c)>1)
			{
				System.out.print(c+" : "+hm.get(c)+"   ");
			}
		}
	}
}