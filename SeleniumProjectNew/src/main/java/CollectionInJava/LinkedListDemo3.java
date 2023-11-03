package CollectionInJava;

import java.util.LinkedList;

public class LinkedListDemo3 {
	

	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.add("Cat");
		l.add("Goat");
		l.add("Cow");
		l.add("Mow");
		
		System.out.println(l);//[Cat, Goat, Cow, Mow]
		// insert new elemet in the first place in the linkedlist
		l.addFirst("Buffolow");
		l.addLast("Tiger");
		
		System.out.println(l);//[Buffolow, Cat, Goat, Cow, Mow, Tiger]
		
		//Get the first the last and first elemet and also any element
		
		//l.get(0);
		System.out.println(l.get(0));
		
		System.out.println(l.getFirst());//Buffolow
		System.out.println(l.getLast());//Tiger
		
		//remove and first elememt and any elemeent
		
		l.removeFirst();
		l.removeLast();
		System.out.println("After removing the first and last elemet"+l);//[Cat, Goat, Cow, Mow]
		
		
		

		
}
	
}
