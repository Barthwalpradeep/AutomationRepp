package Practice.Practice_Project;

public class PrimeNumber {

	public static void main(String[] args) {
		for(int num = 1; num <=100;num++) {
		 for(int i = 2; i<= num/2;i++ ) {
			if(num % i == 0) {
				System.out.println("NUmber is not prime number");
				break;
			}
			else {
				System.out.println("NUmber is prime number");
				break;
			}
		}

	 }
	}

}
