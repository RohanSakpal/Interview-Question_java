class E_CheckOneStrRotateOther
{
	public static void main(String[] args)
	{
		String str1 = "mynameisrohan";
		String str2 = "rohanmynameis";

		if(str1.length() != str2.length())
			System.out.println("not rotate other");
		else
		{
			String str3 = str1 + str1;
			if(str3.contains(str2))
				System.out.println("str1 rotate to other");
			else
				System.out.println("not rotate other");
		}
	}
}