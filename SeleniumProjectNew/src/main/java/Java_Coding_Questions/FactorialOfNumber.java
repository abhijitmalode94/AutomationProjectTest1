package Java_Coding_Questions;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		//5=5*4*3*2*1=120 
		
		int num=5;
		long factorail=1;
		
		for(int i=1;i<=num;i++) {
			factorail=factorail*i;
			
		}
		System.out.println("Factorial of number is "+factorail);
		
		

	}

}
