package Datasructures;

public class findmissing {

	int a[], m_sum=0, t_sum =0, m_num;

	public findmissing(int arr[]) {

		a = arr;
	}

	public void display() {
		System.out.print("Array is: ");
		for(int i:a) {
			System.out.print(i+" ");
		}
		
	}
	
	public int missing() {
		for(int i: a) {
			
		m_sum += i;
		}
		for(int j =1; j<=a.length+1; j++) {
			t_sum += j;
		}
		
		return m_num = t_sum-m_sum;
		
		
	}
	
	
	

	}
