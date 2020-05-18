package Datasructures;

public class second_highest {

	int a[];
	int highest, second_high=0;  ///       3, 5, 1, 0, 2, 7
	

	public second_highest(int[]arr) {

		this.a = arr;

	}

	public void display() {
		System.out.print("The array is: ");

		for(int i: a) {

			System.out.print(" "+i);

		}
	}
		public int get_second_high() {
			

			for(int j:a) {
				
				if(j>highest) {
					second_high = highest;
					highest = j;
				}
				else if(j>second_high){
					second_high = j;
				}
					

			}
			return second_high;
		}

	}

