import java.util.*;
class M_UnionAndIntersection
{
	public static void main(String[] args)
	{
		int[] inputArray1 = {2, 3, 4, 7, 1};
        	int[] inputArray2 = {4, 1, 3, 5};
  		int[] inputArray3 = {8, 4, 6, 2, 1};
    		int[] inputArray4 = {7, 9, 4, 1};
     		union(inputArray1, inputArray2, inputArray3, inputArray4);

		Integer[] inputArraya = {2, 3, 4, 7, 1};
        	Integer[] inputArrayb = {4, 1, 3, 5};
  		Integer[] inputArrayc = {8, 4, 6, 2, 1};
    		Integer[] inputArrayd = {7, 9, 4, 1};
		intersection(inputArraya, inputArrayb, inputArrayc, inputArrayd);
	}
	static void union(int[] ... arrays)
	{
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int[] array : arrays)
		{
			System.out.println(Arrays.toString(array));
			for(int i:array)
				hs.add(i);
		}
		System.out.println("Union of arrays : "+hs);
	}
	static void intersection(Integer[] ... arrays)
	{
		HashSet<Integer> hs = new HashSet<>(Arrays.asList(arrays[0]));
		for(int i=0;i<arrays.length;i++)
		{
			HashSet<Integer> set = new HashSet<>(Arrays.asList(arrays[i]));
			hs.retainAll(set);
		}
		System.out.println("Intersection of arrays : "+hs);
	}
}