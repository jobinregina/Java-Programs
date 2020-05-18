package Datasructures;

/* factoral of any positive number*/

import java.io.IOException;
import java.util.Scanner;

public class finfFac {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i;
		
do {
		System.out.print("Enter a number: ");
		
		Scanner in = new Scanner(System.in);	
		i = in.nextInt();
		if(i<2) {
		System.out.println("Enter a number greater than two");
		}
		else {

			System.out.print("Factors of "+i+": ");
			for(int j=1; j<i; j++) {
				if(i%j==0) System.out.print(j+" ");
			}
			System.out.println();
		}
} while(i>-1);

	}

}
