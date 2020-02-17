package Datasructures;

public class findmissing_main {
	
	public static void main(String args[]) {
		
		findmissing fm = new findmissing(new int[] {11, 12, 14, 7, 15, 8, 10, 9, 6 ,5, 3, 1, 2, 4});
		fm.display();
		System.out.println();
		System.out.println("Missing number is: " +fm.missing());
		
		
	
	
	}

}
