import java.util.*;
class K_RotateArr
{
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6};
		int n = 2;
		leftRotate(a,n);
	}
	static void leftRotate(int a[] , int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			temp = a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j] = a[j+1];	
			}
			a[a.length-1] = temp;
		}
		System.out.println("left rotate : "+Arrays.toString(a));
	}
}