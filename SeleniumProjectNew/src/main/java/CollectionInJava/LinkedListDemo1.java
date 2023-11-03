package CollectionInJava;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// Creat linked list object
		
		LinkedList l=new LinkedList();
		
//		LinkedList<Integer> l=new LinkedList<Integer> ();
//		
//		LinkedList<String> l=new LinkedList<String> ();
//		
		// add element into the linked list
		
		l.add(10);
		l.add("Welcome");
		l.add(12.33);
		l.add('M');
		l.add(true);
		l.add(null);
		System.out.println(l);
		
		//How many nodes we have in linkedList
		System.out.println(l.size());
		
		//to remove thr object from linkedlist
		l.remove(2);
		System.out.println("After removing the element the new LinkedList is :"+l);
		
		// adding element in the middle of LinkedList
		
		l.add(2, 12.35);
		System.out.println("After adding the elemet in the linkedlist:"+l);
		l.add(5, "Hi");
		System.out.println("After adding the elemet in the linkedlist in the null values :"+l);
		
		//retriving the values from the linkedlist
		
		System.out.println(l.get(3));
		
		// Change the values
		l.set(5, 'X');
		System.out.println("After changing the values"+l);
		
		//contains
		System.out.println(l.contains("jAVA"));//fALSE
		
		System.out.println(l.contains("Welcome"));//true
		
		//Check the linkedList is having values or not so use
		
		System.out.println(l.isEmpty());
		
		System.out.println("====================");
		//suppose want to read the data from the  linkedList
		//1.for loop
		System.out.println("Reading element using for loop");
		for(int i=0; i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("====================");
		
		//1.for  each loop
		System.out.println("Reading element using for each  loop");
		
		for(Object e:l) {
			System.out.println(e);
		}
		System.out.println("====================");
		
		//3.Iterator method
		System.out.println("Reading element using iterator");
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
	}

}
