package Java_Coding_Questions;

public class CharCountOcuurINString {

	public static void main(String[] args) {
		
		String str="I love java programing";
		
		int total_count=str.length();
		int total_count_aftrer_remove=str.replaceAll("a", "").length();
		int total_countOfcharA=total_count-total_count_aftrer_remove;
		System.out.println("The total occurance of char a is"+total_countOfcharA);
		
		
}
}

