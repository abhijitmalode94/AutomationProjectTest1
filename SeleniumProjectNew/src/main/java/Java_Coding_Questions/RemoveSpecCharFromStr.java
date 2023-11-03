package Java_Coding_Questions;

public class RemoveSpecCharFromStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="I lov@e ja*&va program%#@%^*ing";
		
		String str2=str.replaceAll("[^a-zA-Z0-9]", " ");
		System.out.println(str2);
	}

}
