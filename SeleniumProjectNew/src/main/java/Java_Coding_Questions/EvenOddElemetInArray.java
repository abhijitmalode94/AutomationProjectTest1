package Java_Coding_Questions;

public class EvenOddElemetInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,5,7,9,20,4,8,13};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println("Number is even--"+arr[i]);
			}
			else {
				System.out.println("Number is odd--"+arr[i]);
			}
		}

	}

}

