/**
 * 
 */
package Chapter1;

/**
 * @author Jobin
 *
 */
public class GalToLitTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gallons, liters;
		int counter;
		
		counter = 0;
		for(gallons = 1; gallons<=150; gallons++) {
			liters = gallons*3.7854;
			System.out.println(gallons + " gallons is " + liters + " liters. ");
			counter++;
			// every 10th line print a blank line
			if(counter==10) {
				System.out.println();
				counter=0;
			}

		}

	}

}
