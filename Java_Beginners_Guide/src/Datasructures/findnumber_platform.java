package Datasructures;

import java.util.Arrays;

public class findnumber_platform {

	int platform_needed, maxplatforms =0;
	int i, j =0;
	int  arr[], dep[], n;

	public findnumber_platform(int a[], int[]dp, int n) {
		this.arr =a;
		Arrays.sort(arr);
		this.dep = dp;
		Arrays.sort(dep);
		this.n = n;

	}

	public int findplatform() {
		while(i<n && j<n) {

			if(arr[i]<dep[j]) {
				platform_needed++;
				i++;
				if(platform_needed>maxplatforms) {
					maxplatforms=platform_needed;
				}
			}

			else {
				platform_needed--;
				j++;
			}
		}
	return maxplatforms;
}
}
