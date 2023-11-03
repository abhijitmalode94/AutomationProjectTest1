package CollectionInJava;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("t");
		al.add("k");
		
		// add AlL - to add all arraylist element into the some other arraylist
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		
		System.out.println(al_dup);
		
		
		//remove all from arryaylist

		al_dup.removeAll(al);
		System.out.println("After removing :"+al_dup);
		
		//Sort the arraylsit
		System.out.println("Element in the arraylist before sorting :"+al);
	
		System.out.println("Element in the arraylist After sorting :"+al);
		
		
		// Sort the array in the decending order
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Element in the arraylist After reverse oder :"+al);
		
		// Shuffle- random roder
		Collections.shuffle(al);
		System.out.println("Element in the arraylist After ahuffle :"+al);
		
		
		
	}

}
