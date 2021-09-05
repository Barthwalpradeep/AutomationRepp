package Practice.Practice_Project;

import java.util.Arrays;

public class HighestLowest {

	public static void main(String[] args) {
	int [] s1 = {23,34,78,99};
	int max = s1[0];
	int min = s1[0];
	
	for(int i =0;i < s1.length;i++) {
		if(max < s1[i]) {
			max = s1[i];
			
		}
		else {
			min = s1[i];
		}
	}
	System.out.println("Maximium number is " +max);
	System.out.println("Maximium number is " +min);

	}

}
