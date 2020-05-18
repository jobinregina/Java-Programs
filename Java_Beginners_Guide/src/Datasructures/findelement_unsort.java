package Datasructures;

import java.util.Arrays;

public class findelement_unsort {

	public static void main(String args[]) {
		
		String arr[] = {"q","w","e","r","t","y","a","s","d","f","g","h","j","k","l","z","x","c","v","b","n","m","u","i"};
		String value = "g";
		boolean found = false;
		
		for(String x:arr) {
			if(x.equals(value)) {
				found = true;
				break;
			}
			
			
		}
		
		if(found) System.out.print("Index value is: " + Arrays.asList(arr).indexOf(value));
	}
}
