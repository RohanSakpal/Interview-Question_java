import java.util.*;
class ArrToAl
{
	public static void main(String[] args)
	{
		//method 1
		String[] arr = new String[] {"android","java","ruby","python","cpp"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(arr));
		System.out.println(al);

		//method 2
		Collections.addAll(al,arr);
		System.out.println(al);

		//method 3
		al.addAll(Arrays.asList(arr));
		System.out.println(al);

		//al to arr
		String[] arr1 = new String[al.size()];
		al.toArray(arr1);
		for(String str : arr1)
		{
			System.out.println(str);
		}
	}
}