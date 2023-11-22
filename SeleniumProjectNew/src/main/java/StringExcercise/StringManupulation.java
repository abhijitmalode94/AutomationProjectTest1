package StringExcercise;

import java.util.Arrays;

public class StringManupulation {
	
	public static void main(String[]args) {
		

		//String- String is collectioj of multiple character
		
		String str="This is Java Coding";

		//1.length of string
		int s1=str.length();
				System.out.println(s1);
		// Gives the charactor at the perticular index		
		System.out.println(str.charAt(5));
		
		//gives index of perticular charactor
		System.out.println(str.indexOf("i"));
		
		System.out.println(str.indexOf("a", 1));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		//9.trim
		String str1="    Hello GoodMorning   ";
		System.out.println(str1.trim());
		
		//10  replace-
		String str2="Hello  word";
		System.out.println(str2.replace("H", "W"));
		
		//11.equals
		
		String str3="I love Java coding";
		String str4="I love Java Coding";
		// Case sensitive - mataches uppercase and lowercase
		System.out.println(str3.equals(str4));
		// not case sensitive -
		System.out.println(str3.equalsIgnoreCase(str4));
		
		//12.Contains
		String str5="Welcome to My Java Class";
		if(str5.contains("Javer")) {
			System.out.println("enroll it");
		}
		else {
			System.out.println("not enroll it ");
		}
		
		//13 split
		
		String str6="I_LOve_Java_Traing_classes";
		String arr[]=str6.split("_");
			System.out.println(Arrays.toString(arr));
			
			
//			
//			 String s = null;
//			System.out.println( s.length());

				
				
	}
	
}
