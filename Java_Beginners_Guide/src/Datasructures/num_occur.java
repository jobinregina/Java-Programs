package Datasructures;

public class num_occur {
	
	int a[];
	int num;
	int count=0;
	
	num_occur(int a[], int n){
		
		this.a = a;
		this.num = n;
		
	}
	
	public void display() {
		System.out.print("The array is: ");

		for(int i: a) {

			System.out.print(" "+i);

		}
	}
	public int getcount() {
		
		for(int i:a) {
			
			if(num==i) count++;
			
		}
		return count;
		
	}

}
