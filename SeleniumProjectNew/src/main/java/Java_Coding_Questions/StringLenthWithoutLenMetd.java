package Java_Coding_Questions;

public class StringLenthWithoutLenMetd {

	public static void main(String[] args) {
		
		String str="Selenium";
		
		int count=0;
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			count++;
			
		}
		System.out.println("Length of String is =="+count);
		
		
	}

}
