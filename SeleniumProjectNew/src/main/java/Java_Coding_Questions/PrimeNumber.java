package Java_Coding_Questions;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=13;
		int count=0;
		
		if(num>1) {
			
			for(int i=1; i<=num; i++) 
			{
				
				if(num%i==0)
					count++;
			}
			
				
				if(count==2)
				{
					System.out.println("Number is prime number");
				}
				else
				{
					System.out.println("Number is not prime number");
				}
		}
			
		
		
		else {
			System.out.println("Enter the valid number");
		}
		

	}
}


