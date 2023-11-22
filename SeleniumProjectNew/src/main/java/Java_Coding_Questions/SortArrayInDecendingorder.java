package Java_Coding_Questions;

public class SortArrayInDecendingorder {

	public static void main(String[] args) {
		
		int temp=0;
		int arr[]= {10,554,84,12,58,745,698,684,400};
		
		System.out.println("Array sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i;j<arr.length;j++) {
				 if(arr[i]<arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 
		 System.out.println("Array sorted in decending order");
		 for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
		 
		 

	}

}
