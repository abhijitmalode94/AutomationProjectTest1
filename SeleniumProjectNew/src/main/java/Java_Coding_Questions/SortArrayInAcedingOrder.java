package Java_Coding_Questions;

public class SortArrayInAcedingOrder {

	public static void main(String[] args) {
		
		int arr[]= {20,30,58,1,5,40,25,};
		int temp=0;
		System.out.println("Array Sorting");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+" ");
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i; j<arr.length;j++) {
				if(arr[i]>arr[j]) {     // for the decending order make arr[i]<arr[j]
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
					
				}
			}
		}
		
		System.out.println("Sorted array in ascending order");
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" "+" ");
		}

	}

}
