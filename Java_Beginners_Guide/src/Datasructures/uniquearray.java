package Datasructures;
/*
 * find the duplicate element
 */

import java.util.*;

public class uniquearray {
  
	
	int a[];
	
	public uniquearray(int arr[]) {
		
		this.a = arr;
		
	}
	
	/*
	
	public int getarray() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) return a[i];
			}
		}
		return -1;
	}
	*/
	
	public int getarray() {
	HashSet<Integer> hash_set = new HashSet<Integer>();
		for(int i:a) {
			if(!hash_set.add(i))return a[i];
		} return -1;
	}

	
	
}


