package CollectionInJava;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		String arr []= {"Dog","Cat","Tiger"};
		
		for(String e:arr) {
			System.out.println(e);
		}
		
		//Convert arrat into arraylist
		
		ArrayList al = new ArrayList(Arrays.asList(arr));
		
		System.out.println(al);
	}

}
