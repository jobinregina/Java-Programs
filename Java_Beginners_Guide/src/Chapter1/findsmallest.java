package Chapter1;

public class findsmallest {
	
	int [] a;
	
	
	public findsmallest(int arr[]){
		
		a = arr;
		
	}
	
public void display() {
	for(int i:a) {
		System.out.print(i+" ");
	}
	
	System.out.println();
}



public void find() {
	int smallest = a[0];
	int largest = a[0];
for(int i:a) {
	if (i<smallest) smallest = i;
	if (i>largest) largest =i;
}

System.out.println("Smallest: "+smallest);
System.out.println("Largest: "+largest);
}

	
}
