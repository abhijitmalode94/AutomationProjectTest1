package CollectionInJava;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {

	public static void main(String[] args) {
		// Ways to create hashmap object
		Hashtable t=new Hashtable();
		
		//Deafult capacity  is 11 and load factor is 0.75
		
		//Hashtable t=new Hashtable(Intial Capicty, load factor/fill ratio);
		
		//Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101, "Tom");
		t.put(102, "Welcome");
		t.put(103, "david");
		t.put(104, "Marry");
		
		
		System.out.println(t);
		
//		t.put(null, "X");//.NullPointerException:
//		System.out.println(t);
//		t.put(106, null);
//		System.out.println(t);//java.lang.NullPointerException
		
		//get the value of the perticular key
		System.out.println(t.get(102));
		
		System.out.println(t.remove(103));
		System.out.println("After removing the "+t);
		
		
	}

}
