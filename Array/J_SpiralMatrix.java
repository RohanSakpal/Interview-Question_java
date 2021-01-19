import java.util.*;
class J_SpiralMatrix
{
	public static void main(String[] args)
	{
		int n = 5;
		int a[][] = new int[n][n];
		int value = 1;
		int mincol = 0;
		int maxcol = n-1;
		int minrow = 0;
		int maxrow = n-1;
		
		while(value <= n*n)
		{
                	for(int i=mincol;i<=maxcol;i++)
			{
                		a[minrow][i] = value;
				value++;
            		}
			for(int i=minrow+1;i<=maxrow;i++)
			{
                		a[i][maxcol] = value;
				value++;
            		}
			for(int i=maxcol-1;i>=mincol;i--)
			{
				a[maxrow][i] = value;
                		value++;	
            		}
			for(int i=maxrow-1;i>=minrow+1;i--)
			{
                		a[i][mincol] = value;
				value++;
            		}
			mincol++;
			minrow++;
			maxcol--;
			maxrow--;
            	}
		for(int i=0;i<a.length;i++)
		{
                	for(int j=0;j<a.length;j++)
			{
                		System.out.print(a[i][j]+" ");
            		}
			System.out.println();
            	}
	}
}