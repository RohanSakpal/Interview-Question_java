import java.util.*;
class A_IntersectionOfTwoArr
{
	public static void main(String[] args)
	{
//method1	Integer[] i1 = {1, 2, 3, 4, 5, 4};
//		Integer[] i2 = {3, 4, 5, 6, 7, 4};
//
//		HashSet<Integer> hs1 = new HashSet<>(Arrays.asList(i1));
//		HashSet<Integer> hs2 = new HashSet<>(Arrays.asList(i2));
//
//		hs1.retainAll(hs2);
//		System.out.println(hs1);

//method2
		int[] array1 = {1, 2, 3, 4, 5, 4};
		int[] array2 = {3, 4, 5, 6, 7, 4};
		HashMap<Integer,String> map1 = new HashMap<>();
		HashMap<Integer,String> map2 = new HashMap<>();
		for(int i = 0; i < array1.length; i++){
		map1.put(array1[i], "Const");
		}

		for(int i = 0; i < array2.length; i++){
			if(!map1.containsKey(array2[i]))
				map1.put(array1[i], "Const");
			else{
				System.out.print(array2[i]+" ");
				map2.put(array2[i], "Const");
			}
		}
		System.out.println("Common elts " + map2);
	}

}