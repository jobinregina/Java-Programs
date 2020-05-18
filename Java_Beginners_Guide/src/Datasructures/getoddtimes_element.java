package Datasructures;

public class getoddtimes_element {
	
	int result=0;
	int a[];
	
	public getoddtimes_element(int[] arr) {
		this.a=arr;
	}
	
	public int getoddtimes() {
		for(int i: a) {
			result = result^i;
			
		}
		return result;
	}

}
