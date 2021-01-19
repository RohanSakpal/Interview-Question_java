import java.util.*;

class K_RemoveVowels {
	public static void main(String[] args) {
		
		String str = "Java Concept Of The Day";

		ArrayList<Character> list = new ArrayList<Character>();
		list.add('A');
		list.add('E');
		list.add('I');
		list.add('O');
		list.add('U');
		list.add('a');
		list.add('e');
		list.add('i');
		list.add('o');
		list.add('u');

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if(!list.contains(ch)) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString()); // Jv Cncpt f Th Dy
	}
}

/*
Inbuild funct
String newStr = str.replaceAll("[AEIOUaeiou]","")


method2 : 
String removeVowels(String S) {
        Character vowels[] = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'}; 
           
         List<Character> al = Arrays.asList(vowels); 
           
         StringBuffer sb = new StringBuffer(S); 
           
         for (int i = 0; i < sb.length(); i++) { 
              
             if(al.contains(sb.charAt(i))){ 
                sb.replace(i, i+1, "") ; 
                i--; 
             } 
        } 
    
        return sb.toString(); 
    }