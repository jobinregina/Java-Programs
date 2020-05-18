package Datasructures;

public class bubblesort_optimized {
	
	String arr[];
	
	bubblesort_optimized(String a[]){
		
		this.arr = a;
		
	}
	
	public void bubblesort_details() {
		
		String temp;
		int N = arr.length;
		boolean swap;
		for(int i=0; i<N-1; i++) {
			swap = false;
			for(int j=0; j<N-i-1; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
					swap = true;
				}
			}
			if(swap==false) break;
			}
		System.out.print("Sorted array is:");
		for(int k=0; k<arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}

}
