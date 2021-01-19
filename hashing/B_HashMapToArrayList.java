import java.util.ArrayList; 
import java.util.Collection; 
import java.util.HashMap; 
import java.util.Map.Entry; 
import java.util.Set; 
class B_HashMapToArrayList
{ 
	public static void main(String[] args)
	{ 
        	HashMap<String , String> hm = new HashMap<String,String>();
		hm.put("java","jdbc");
		hm.put("python","pdbc");
		hm.put("ruby","rdbc");
		hm.put("cpp","cdbc");
		System.out.println("hashmap : "+hm);

		Set<String> ks = hm.keySet();
		ArrayList<String> alk = new ArrayList<String>(ks);
		System.out.print("Arraylist of keyset : ");
		for(String key : alk)
		{ 
        		System.out.print(key+" ");
        	}
		System.out.println();


		Collection<String> vs = hm.values();
		ArrayList<String> alv = new ArrayList<String>(vs);
		System.out.print("Arraylist of values : ");
		for(String val : alv)
		{ 
        		System.out.print(val+" ");
        	}
		System.out.println();

		Set<Entry<String,String>> hmes = hm.entrySet();
		ArrayList<Entry<String,String>> ales = new ArrayList<Entry<String,String>>(hmes);
		System.out.print("Arraylist of entrySet : ");
		for(Entry<String,String> es : ales)
		{ 
        		System.out.println(es.getKey()+" "+es.getValue());
        	}
        } 
}