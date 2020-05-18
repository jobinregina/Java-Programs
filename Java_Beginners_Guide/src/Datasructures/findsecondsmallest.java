package Datasructures;

public class findsecondsmallest {
	
	int a[] = {-111234,1, 0, 40,5,650000,2,45,8,9, 7, 25000, -34567};
	
	public static void main(String args[]) {
		findsecondsmallest fss = new findsecondsmallest();
		fss.disp();
		fss.seconsmalldef();
		
		
	}
	
	public void disp() {
		System.out.print("The array is ");
		for(int i: a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public void seconsmalldef() {
		
		int smallest=0;
		int smaller=0;
		int largest=0;
		int larger=0;
		for(int j: a) {
			if(j<smallest) {
				smaller = smallest;
				smallest = j;
			}else if (j < smaller && j > smallest) {
                smaller = j;
            }
			if(j>largest) {
				larger = largest;
				largest = j;
			}else if (j > larger && j < largest) {
                larger = j;
            }
		}
		
		System.out.println("smallest: "+smallest);
		System.out.println("smaller: "+smaller);
		System.out.println("largest: "+ largest);
		System.out.println("larger: "+larger);
		
	}

}
