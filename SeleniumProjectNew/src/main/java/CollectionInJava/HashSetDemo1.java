package CollectionInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// way to create Hashset object
		
		HashSet hs=new HashSet();
		// default capacity is 
		//load factor is
		
		//HashSet hs=new HashSet(100);//initail capacity is 100
		
		//HashSet hs=new HashSet(100,float(0.75));//
		
		
		//HashSet<String> hs=new HashSet<String>();
		
		// add elemet in the Hashset
		hs.add("tom");
		hs.add("CA");
		hs.add('M');
		hs.add(28);
		hs.add(15.33);
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);//[null, tom, 28, M, 15.33, CA, true]
		
		// remove object from hashset
		System.out.println(hs.remove("CA"));
		
		System.out.println("After removing the object"+hs);
		
		//contains
		System.out.println(hs.contains("tom"));//true
		System.out.println(hs.contains(44));//false

		//isempty
		System.out.println(hs.isEmpty());
		
		System.out.println("================");
		
		//Read the object/ elemet from the object
		
		System.out.println("Reading the Hashset Values suing for each loop");
		
		//1.using for each loop
		for(Object e:hs) {
			System.out.println(e);
		}
		
		System.out.println("================");
		
		
		//2.iterator
		System.out.println("Reading the Hashset Values using iterator");
		Iterator it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
		
		
		
	}

}
