package Datasructures;

public class num_occur_main {

	public static void main(String[] args) {
		
		int a[] = {2, 3, 4, 5, 6, 6, 8, 2, 3, 9, 0, 4, 1, 0, 2, 8, 7};
		int n = 8;
		num_occur no = new num_occur(a, n);
		System.out.println("Number of occurences of "+n+" is : "+ no.getcount());
		
	}

}
