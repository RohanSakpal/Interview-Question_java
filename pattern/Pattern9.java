/* i/p: 4
o/p:
1
2*3
4*5*6
7*8*9*10
7*8*9*10
4*5*6
2*3
1
*/
import java.util.*;
class Pattern9 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++){
                		System.out.print(count++);
        		}
			System.out.println();
		}
		for(int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--){
                		System.out.print(--count);
        		}
			System.out.println();
		}
	}
}