package CollectionInJava;

import java.util.HashSet;

public class HashSetDemo3 {

	public static void main(String[] args) {
		// Union , interdection, differnce
		
	HashSet<Integer> hs1=new HashSet<Integer>();
	hs1.add(1);	
	hs1.add(2);
	hs1.add(3);
	hs1.add(5);
	hs1.add(4);
	
	System.out.println("HashSet1"+hs1);//HashSet1[1, 2, 3, 4, 5]
	
	HashSet<Integer> hs2=new HashSet<Integer>();
	hs2.add(7);	
	hs2.add(2);
	hs2.add(3);
	hs2.add(6);
	hs2.add(4);
	
	System.out.println("HashSet2"+hs2);//HashSet2[2, 3, 4, 6, 7]
	
	//Union 
	
	hs1.addAll(hs2);
	//get all unique element
	System.out.println(hs1);//[1, 2, 3, 4, 5, 6, 7]
	
	//Intersection
	hs1.retainAll(hs2);
	//get all common element
	System.out.println(hs1);
	
	
	

	}

}
