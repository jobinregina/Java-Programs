package Datasructures;

import java.util.ArrayList;

public class pairsum {

	public static void main(String args[]) {


		int arr[]= {1, 3, 5, 7, 9, 11, 13, 19, 21, 43};
		int sum = 0;
		ArrayList<Integer> out = new ArrayList<Integer>();

		for(int i=0; i<arr.length-1; ) {
			
			sum = arr[i]+arr[i+1];
			i=i+2;
			out.add(sum);

		}
		
		for(int j: out) {
			System.out.print(j+ " ");
		}
		
	}


	}
