package CollectionInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		// other types of arratlist declaration

		// ArrayList<String> al=new ArrayList<String>();

		// List al2=new ArrayList();

		// add element to the arrayList

		al.add(100);
		al.add("Welcome");
		al.add('A');
		al.add(true);
		al.add(15.5);

		System.out.println(al);

		// How many object are store in Arraylist
		int arraySize = al.size();
		System.out.println("Number of elememt in the array" + arraySize);

		al.remove(1);
		System.out.println("Array after removing the element" + al);

		// add with index

		al.add(1, "Abhijit");
		System.out.println("Array after adding  the element" + al);

		// retrive the specific value from arraylsist
		al.get(3);
		
		//replace the existing values of element with new values
		al.set(2, "Python");
		System.out.println("After replacing the element"+al);
		
		System.out.println(al.contains(100));//true
		
		//Isempty
		System.out.println(al.isEmpty());
		
		System.out.println("===========================");
		
		//How to read the data from arrayList 
		//1.By using for loop
		System.out.println("Reading element using for loop");
		
		
		for(int i=0; i<al.size();i++) {
			System.out.println( al.get(i));

			
		}
		
		System.out.println("===========================");
		//2.By using for each loop
		System.out.println("Reading element using for each loop");
		for(Object e:al) {
		System.out.println(e);
		}
		
		System.out.println("===========================");
		
		//3.Iterator
		System.out.println("Reading element usingIterator");
		
		Iterator it=al.iterator();
		
		while(it.hasNext()) {
			// hasnext check if iterator having element or not
			
			System.out.println(it.next());// printing thge element and move to next
		}
	}

}
