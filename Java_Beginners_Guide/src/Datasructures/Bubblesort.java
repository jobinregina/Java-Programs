package Datasructures;

/*this program implements           

bubble sort*/

public class Bubblesort{
	int arr[]; // [2 6 9 1 0 -3 4 12 8 ]
	public Bubblesort(int a[]){
		this.arr = a;
	}
	public void sortdefinition(){
		int i,j,tmp=0;
		int N = arr.length;
		for( i=0; i<N-1; i++){
			for(j=0; j<N-i-1; j++){
				if(arr[j]>arr[j+1]){
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.print("Sorted array is:");
		for(int k=0; k<arr.length; k++) {
			System.out.print(" " + arr[k]);
		}
	}
}
