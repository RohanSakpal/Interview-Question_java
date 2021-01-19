//Saddle point of a matrix is an element in the matrix which is smallest in its row and largest in its column. A matrix can have many or no saddle points.

import java.util.*;
class L_saddlePoint
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
         	System.out.println("Enter the number of rows :");
         	int rows = sc.nextInt();
         
        	System.out.println("Enter the number of columns :");
         	int cols = sc.nextInt();
         
        	int[][] matrix = new int[rows][cols];
         
        	System.out.println("Enter the elements :");
         
        	for (int i = 0; i < rows; i++) 
        	{
            		for (int j = 0; j < cols; j++)
            		{
                		matrix[i][j] = sc.nextInt();
            		}
        	}
         	System.out.println("The input matrix is :");
         	for (int i = 0; i < rows; i++) 
        	{
            		for (int j = 0; j < cols; j++)
            		{
                		System.out.print(matrix[i][j]+"\t");
            		}
             		System.out.println();
        	}
         	findSaddlePoint(matrix);
	}
	
	static void findSaddlePoint(int[][] matrix)
	{
                for(int i=0;i<matrix.length;i++)
		{
                	int rowmin = matrix[i][0];
			int colInd = 0;
			boolean point = true;
			for(int j=1;j<matrix[i].length;j++)
			{
                		if(matrix[i][j]<rowmin)
				{
                			rowmin = matrix[i][j];
					colInd = j;
        			}
        		}
			
			for(int j=0;j<matrix.length;j++)
			{
                		if(matrix[j][colInd]>rowmin)
				{
					point = false;
                			break;
        			}
        		}

			 if(point)
            		{
                		System.out.println("Saddle Point is : "+rowmin);
            		}
        	}
        }
}