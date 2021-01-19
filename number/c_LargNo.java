//For example, If 145 is the given number and 4 is the given digit, 
//then you should find the largest number less than 145 such that it should not contain 4 in it. 
//In this case, 139 will be the answer.

import java.util.*;
class c_LargNo
{
	public static void main(String[] args)
	{
		int num = 123;
		int digit = 2;
		char c = Integer.toString(digit).charAt(0);
		for(int i=num;i>0;i--)
		{
			if(Integer.toString(i).indexOf(c) == -1)
			{
				System.out.print(i);
				break;
			}
		}
	}
}