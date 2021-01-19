import java.util.*;
import java.text.DecimalFormat;
class G_PercentOfUppLowDigSS
{
	public static void main(String[] args)
	{
		String str = "My e-mail : eMail_Address321@anymail.com";
		int length = str.length();
		int upperCou = 0;
		int lowerCou = 0;
		int digitCou = 0;
		int spesymCou = 0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);

			if(Character.isUpperCase(ch))
				upperCou++;
			else if(Character.isLowerCase(ch))
				lowerCou++;
			else if(Character.isDigit(ch))
				digitCou++;
			else
				spesymCou++;
		}
		
		double upperPer = (upperCou*100.0)/length;
		double lowerPer = (lowerCou*100.0)/length;
		double digitPer = (digitCou*100.0)/length;
		double spesymPer = (spesymCou*100.0)/length;

		DecimalFormat formatter = new DecimalFormat("##.##");
		System.out.println("upper : "+formatter.format(upperPer)+"%");
		System.out.println("lower : "+formatter.format(lowerPer)+"%");
		System.out.println("digit : "+formatter.format(digitPer)+"%");
		System.out.println("special symbol : "+formatter.format(spesymPer)+"%");
	}
}