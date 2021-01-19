import java.util.*;
class G_FindLeader
{
	public static void main(String[] args)
	{
		int a[] = {14,9,13,7,8,5,3};
//		for(int i=0;i<a.length;i++)
//		{
//			Boolean flag = true;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[j]>a[i])
//				{
//					flag = false;
//					break;
//				}
//			}
//			if(flag)
//			{
//				System.out.println(a[i]);
//			}
//		}
		int length = a.length;
		int max = a[length-1];
		System.out.println(a[length-1]);
		for(int i=a.length-2;i>=0;i--)
		{
			if(a[i]>max) {
				System.out.println(a[i]);
				max = a[i];
			}
			
		}		
	}
}