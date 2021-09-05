package Practice.Practice_Project;

public class ReverseInt {

	public static void main(String[] args) {
		int num = 897654;		
		System.out.println(revnum(num));
	}
	
	public static int revnum(int num) {
		int revnum = 0;
		while(num != 0) {
		if(num%10 > 0) {			
			 revnum = revnum *10 + num%10;
			num = num/10;
			
		}	
		
	}
		return revnum;
		
	}
}


