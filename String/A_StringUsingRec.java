class StringUsingRec
{
	public static void main(String[] args)
	{
		String str = "rohan";
		System.out.println(reverse(str));
	}
	public static String reverse(String str)
	{
		 if ((null == str) || (str.length() <= 1))
     		{
            		return str;
     		}
            	
		return reverse(str.substring(1)) + str.charAt(0);	
	}
}

//reverse(ohan) + r;
//reverse(han) + 0 + r;
//reverse(an) + h + o + r;
//reverse(n) + a + h + o + r;
// nahor