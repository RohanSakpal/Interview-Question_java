import java.util.*;
class Synchocoll
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("python");
		al.add("ruby");
		al.add("cpp");
		List<String> collal = Collections.synchronizedList(al);
		// for set : Set<String> collal = Collections.synchronizedSet(al);
		// for map : Map<String,Integer> collal = Collections.synchronizedMap(al);
		synchronized(collal)
		{
			Iterator<String> it = collal.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}
}