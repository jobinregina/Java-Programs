package Datasructures;

public class findsmallest_binarysearchmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findsmallest_binarysearch fsm = new findsmallest_binarysearch(new int[] {29, -1, 5, 6, 10, 19, 20, 26});
		fsm.display();
		System.out.println();
		System.out.println("The smallest is: "+fsm.smallest());

	}

}