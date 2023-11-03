package CollectionInJava;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

		//HashMap m = new HashMap();
		// for specific datatype

		 HashMap<Integer,String> m=new HashMap<Integer,String>();

		m.put(101, "Tom");
		m.put(102, "Welcome");
		m.put(103, "david");
		m.put(104, "Marry");

		System.out.println(m);// {101=Tom, 102=Welcome, 103=david, 104=Marry}

		// adding dup values
		m.put(106, "Tom");
		System.out.println(m);// {101=Tom, 102=Welcome, 103=david, 104=Marry, 106=Tom}

		// get values from hashmap by passing key
		System.out.println(m.get(101));// Tom

		// remove the pair
		m.remove(106);
		System.out.println("After removing apir form hasmap" + m);// After removing apir form hasmap{101=Tom,
																	// 102=Welcome, 103=david, 104=Marry}
		
		System.out.println(m.containsKey(102));//true
		System.out.println(m.containsKey(106));//false
		
		System.out.println(m.containsValue("david"));//true
		System.out.println(m.containsValue("malan"));//false
		
		System.out.println(m.isEmpty());//false
		
		// want to get only keys from hashmap-
		System.out.println(m.keySet());//return all keys from the set
		                                //[101, 102, 103, 104]
		
		System.out.println("*************************");
		
		// reading the individulas keys 
		
		for(Object i:m.keySet()) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		
		for(Object i:m.values()) {
			System.out.println(i);
		}
		
		System.out.println("*************************");
		
		System.out.println(m.keySet());
		System.out.println("*************************");
		// want to key ans values one by one

		for(Object i:m.keySet()) {
			System.out.println(i+"  "+m.get(i));
		}
		
		
		///System.out.println(m.values());//return all values as collection not a set
		                                //[Tom, Welcome, david, Marry]
		
		
		//System.out.println(m.entrySet());// all the entries as set
		                              //[101=Tom, 102=Welcome, 103=david, 104=Marry]
		
 
		//Entry methood
		
		//define the entry map.entry 
		 for(Map.Entry entrty:m.entrySet()) {
			 System.out.println();
		 }
		

	}

}
