import java.util.*;
class FindLongestSubstr
{
	public static void main(String[] args)
	{
		longestSubstr("javaconceptoftheday");
	}
	static void longestSubstr(String str)
	{
		char[] chArr = str.toCharArray();
		String LongSubStr = null;
		int LongStrLen = 0;

		LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<Character,Integer>();
		for(int i=0;i<chArr.length;i++)
		{
			char ch = chArr[i];
			if(!lhm.containsKey(ch)) {
				lhm.put(ch,i);
			}
			else {
				i = lhm.get(ch);
				lhm.clear();
			}

			if(lhm.size() > LongStrLen)
			{
				LongStrLen = lhm.size();
				LongSubStr = lhm.keySet().toString();
			}
		}
		System.out.println("input str : "+str);
		System.out.println("longest length : "+LongStrLen);
		System.out.println("longest subStr : "+LongSubStr);
	}
}