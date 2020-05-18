package Datasructures;

public class pairsum_closeto_X {
	
	int minimumDiff = Integer.MAX_VALUE;
	int arr[];
	int x;
	
	pairsum_closeto_X(int a[],int n) {
		
		this.arr = a;
		this.x = n;
		
	}
	
	public void getpairsum() {
		int n = arr.length;
		int l=0, r=n-1;
		int minLeft=l, minRight=n-1;
		while(l<r) {
			int currentDiff= Math.abs(arr[l] + arr[r]-x);
			/*If abs(diff) is less than min dif, we need to update sum and pair */
			if(currentDiff < minimumDiff)
			{
				minimumDiff = currentDiff;
				minLeft = l;
				minRight = r;
			}
			if(arr[l] + arr[r] < x)
				l++;
			else
				r--;
		}
		System.out.println(" The pair whose sum is closest to X : "+arr[minLeft]+" "+ arr[minRight]);
	}
	
	

}
