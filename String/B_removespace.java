class B_removespace
{
	public static void main(String[] args)
	{
		String str = "OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab";
		String newstr = "";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
				newstr = newstr + str.charAt(i);
		}
		System.out.println(newstr);
	}
}

//inbuild funct
//String stringWithoutSpaces = inputString.replaceAll("\s+", "");