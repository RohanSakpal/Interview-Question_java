import java.util.*;
class J_PalindromeStr
{
public static void main(String[] args)
{
	if(check("rohan"))
		System.out.println("it is palindrome");
	else
		System.out.println("It is not palindrome");
}
static boolean check(String str)
{
	if(str.length()<2)
		return true;
	else
	{
		if(str.charAt(0)!=str.charAt(str.length()-1))
			return false;
		else
			return check(str.substring(1,str.length()-1));
	}	
}
}
