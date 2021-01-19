import java.util.*;
class A_RemoveDupliFromAL
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("cpp");
		al.add("cpp");
		al.add("ruby");
		al.add("java");
		al.add("ruby");

		System.out.println("old ArrList : "+al);

		LinkedHashSet<String> lhs = new LinkedHashSet<String>(al);  //element get in order hence we use linkedhashset
		System.out.println("new ArrList : "+lhs);

	}
}