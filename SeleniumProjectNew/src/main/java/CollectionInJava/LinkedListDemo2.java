package CollectionInJava;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);

		System.out.println(l);

		// add the above linkedlist into the another linked listy

		LinkedList l_dup = new LinkedList();
		l_dup.addAll(l);

		System.out.println("After adding the l linkedlist in the new linkedlist" + l_dup);
		
		 l_dup.removeAll(l);
		 System.out.println(l_dup);
		 
		 // sort
		 System.out.println("Before sorting "+l);
		 
		 Collections.sort(l);
		 System.out.println("After sorting "+l);
		 // reverse
		 Collections.sort(l,Collections.reverseOrder());
		 System.out.println("After reverse "+l);
		 
		 System.out.println("before shuffle"+l);
		 
		 Collections.shuffle(l);
		 System.out.println("After suffle"+l);
		 

	}

}
