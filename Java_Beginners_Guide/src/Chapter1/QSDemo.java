package Chapter1;

public class QSDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a[] = {'d','x','a','r','p','j','i'};
		int i;

		// print the array
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}

		System.out.println();

		// start sorting of array
		QuickSort.qsort(a);

		// print sorted array
		for(i=0;i<a.length;i++) {
			System.out.print(a[i]);
		}


	}

}
