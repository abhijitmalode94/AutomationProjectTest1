package Java_Coding_Questions;

public class CountTheWodrsIntheString {

	public static void main(String[] args) {
		String str="I love java programing";
//		
//		int len=str.length();
//		int count=1;
//		
//		for(int i=0;i<len-1;i++) {
//			if((str.charAt(i)==' ')&&(str.charAt(i)!=' ')) {
//				count++;
//				}
//			}
//		
//		System.out.println(count);
		String words = "One Two Three Four";
		int countWords = words.split("\\s").length;
		System.out.println(countWords);

	}

}
