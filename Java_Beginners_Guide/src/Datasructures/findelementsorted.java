package Datasructures;

public class findelementsorted {

	int arr[];
	int num;

	findelementsorted(int a[], int n){
		this.arr = a;
		this.num = n;
	}
	public int arraysearch() {
		int low=0;
		int high = arr.length-1;
		int mid;

		while(low<=high) {
			mid = low+((high-low)/2);
			if (arr[mid]==num) return arr[mid];
			if (arr[mid]<=arr[high]) {
				if (num > arr[mid]&&num<=arr[high]) {
					low = mid+1;
				}
				else {
					high = mid-1;
				}
			}
			else {
				if (num >= arr[low]&&num<arr[mid]) {
					high = mid-1;
				}
				else {
					low = mid-1;
				}
			}
		}
		return -1;
	}

}
