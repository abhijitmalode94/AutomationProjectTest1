package CollectionInJava;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue();
		
		pq.add("A");
		pq.add("B");
		pq.add("C");
		pq.offer("D");
		pq.add("A");
		
		System.out.println(pq);//[A, B, C, D]
		
		pq.offer("G");
		
		System.out.println(pq);//[A, A, C, D, B, G]
		
		//get head element
		
		System.out.println(pq.element());//A
		
		System.out.println(pq.peek());////A
		
		System.out.println(pq.remove());//A
		System.out.println("After removing"+pq);//[A, B, C, D, G]
		
		System.out.println(pq.poll());//A
		System.out.println("After removing"+pq);//B, D, C, G]
		
	

	}

}
