package Datasructures;
/*
 * find missing element in an array- binary search
 */
public class findelementsortedarray {

	int arr[];
	int num;

	findelementsortedarray(int a[], int n){
		this.arr = a;
		this.num = n;
	}
	public int arraysearch() {
		int low=0;
		int high = arr.length-1;
		int mid;

		
		//Check if a[mid…high] is sorted 
		while(low<=high) {
			mid = low+((high-low)/2);
			if (arr[mid]==num) return mid;
			
			if (arr[mid]<=arr[high]) {
				if (num > arr[mid]&&num<=arr[high]) { //If number lies between the higher range.
					low = mid+1;
				}
				else {
					high = mid-1; 
				}
			}
			else {
				if (num >= arr[low]&&num<arr[mid]) { //If number lies between the lower range.
					high = mid-1;
				}
				else {
					low = mid+1;
				}
			}
		}
		return -1;
	}

}
