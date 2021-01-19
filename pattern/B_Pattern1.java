import java.util.*;
class B_Pattern1
{
	public static void main(String[] args)
	{
                Scanner sc = new Scanner(System.in);
		System.out.println("Enter no row");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n-i;j>0;j--)
                	{
                		System.out.print(" ");
            		}
			for(int j=1;j<=i;j++)
                	{
                		System.out.print("* ");
            		}
			System.out.println();
            	}
        }
}


//         *
//        * *
//       * * *
//      * * * *
//     * * * * *
//    * * * * * * 

//if we put j in position of *
//         1
//        1 2
//       1 2 3

//if we put i in position of *
//         1
//        2 2
//       3 3 3

 
