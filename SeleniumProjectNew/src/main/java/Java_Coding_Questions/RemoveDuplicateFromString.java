package Java_Coding_Questions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	
	public static void main(String[]args) {
	
	String str="abhvvvvhhbb";
	//covert the string into the character array
	
	char c[]=str.toCharArray();
	
	Set<Character> sch=new LinkedHashSet<Character>();
	
	for(char e:c) {
		sch.add(e);
		
		
	}
	
	StringBuilder sc=new StringBuilder();
	for(char e1:sch) {
		sc.append(e1);
	}
	System.out.println(sc.toString());
	System.out.println(sc.length());


}
}
