package Java_Coding_Questions;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		String str[]= {"Java","Python","Ruby","Java"};
		
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i].equals(str[j])) {
					System.out.println("dup elemet is--- "+str[i]);
				}
			}
		}

	}

}
