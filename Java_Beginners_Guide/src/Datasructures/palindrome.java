package Datasructures;
/*
 * find palindrome of a string
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class palindrome {
	
	String original, reverse = "";
		
	
	public void verify() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String");
		original = br.readLine();
		
		int l = original.length();
		String msg1 = "Not palindrome";
		String msg2 = "palindrome";
		for(int i =l-1; i>=0; i--) {
			reverse = reverse+original.charAt(i);
		}
			if(original.equalsIgnoreCase(reverse)) {
				System.out.println(msg2);
			}
			else {
				System.out.println(msg1);
			}
		
	}

}
