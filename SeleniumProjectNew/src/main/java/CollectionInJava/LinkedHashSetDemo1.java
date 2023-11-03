package CollectionInJava;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
	
		LinkedHashSet lhs=new LinkedHashSet();
		//	LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add("Tom");
		lhs.add(100);
		lhs.add('T');
		lhs.add("Tie");
		lhs.add(12.33);
		lhs.add(true);
		
		System.out.println(lhs);
		
		// same method of hashset is applicable to Linkedhasset
		
	 

	}

}
