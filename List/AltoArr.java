import java.util.*;
class AltoArr
{
	public static void main(String[] args)
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println(al);

		Object[] arr = al.toArray();
		for(Object n : arr)
		{
			System.out.println(n);
		}
	}
}