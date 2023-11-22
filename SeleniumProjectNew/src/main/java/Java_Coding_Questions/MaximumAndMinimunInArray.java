package Java_Coding_Questions;

public class MaximumAndMinimunInArray {

	public static void main(String[] args) {
		
		int arr[]= {10,20,8,55,6,1,40};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			else if(arr[i]<smallest){
				smallest=arr[i];
				
			}
		}
		
		System.out.println(largest);
		System.out.println(smallest);

	}

}
