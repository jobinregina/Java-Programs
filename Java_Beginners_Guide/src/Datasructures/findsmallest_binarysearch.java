package Datasructures;
/*
 * find the smallest element of an array using binary search
 */

public class findsmallest_binarysearch {
	
	int [] a;
	
	findsmallest_binarysearch(int[]arr){
		
		this.a = arr;
	}
	
	public void display() {
		System.out.print("The array is: ");
		for(int i:a) {
			System.out.print(" "+i);
		}
	}
	
	public int smallest() {                           
		int low=0;
		int high=a.length-1;
		int mid;
		while(a[low]>a[high]) {
			mid = (high+low)/2;
			if(a[mid]>a[high]) low = mid+1;
			else high=mid;
		}
		return a[low];
	}

}
