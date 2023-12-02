package Java_Coding_Questions;

public class MissingNumberfromArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,4,5};
		
		int sum=0;int sum1=0;
		for(int i=0;i<arr.length;i++) {			sum=sum+arr[i];
		}
	System.out.println(sum);
		
		for(int j=0;j<=5;j++) {
			sum1=sum1+j;
		}
		System.out.println(sum1);
		System.out.println(sum1-sum);

}

}
