package Practice.Practice_Project;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FreqencyCount {

	public static void main(String[] args) {
		String s1 = "my name is mahmood aalu";
		int [] arr2 = {1,2,2,2,3,3,4,4,5,5,5,5,6};
		//char[] arr1 = s1.toCharArray();
		//char[] arr = {'a','a','b','b','b','c','c','l'};
		Map<Integer,Integer> freemap = new HashMap<Integer,Integer>();
		
		
		for(Integer i : arr2) {
			if(freemap.containsKey(i)) {
				freemap.put(i, freemap.get(i)+1);				
			}
			else
			{  
				freemap.put(i, 1);
			}			
		}
		
		Set<Entry<Integer,Integer>> entryset = freemap.entrySet();
		for(Entry<Integer,Integer> entry : entryset) {
			if(entry.getValue()>=1) {
				System.out.println(entry.getKey()+"::Repeating value is:: "+entry.getValue());
			}
		}
		

	}

}
