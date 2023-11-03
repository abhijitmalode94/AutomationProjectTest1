package CollectionInJava;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		HashSet<Integer> evennumber=new HashSet<Integer>();
		
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		evennumber.add(8);
		
		System.out.println("Hashset"+evennumber);//Hashset[2, 4, 6, 8]
		
		HashSet<Integer>number=new HashSet<Integer>();
		
		
		number.addAll(evennumber);
		number.add(10);
		
		System.out.println("After adding  the previous hashset"+number);//[2, 4, 6, 8, 10]

		System.out.println(number.removeAll(evennumber));//true
		
		System.out.println(number);//[10]
		
		
	}

}
