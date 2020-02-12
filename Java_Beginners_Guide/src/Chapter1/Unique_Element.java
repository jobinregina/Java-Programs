package Chapter1;

public class Unique_Element {

	void printRepeating(int arr[], int size)  
    { 
        int count[] = new int[size]; 
        int i; 
  
        System.out.println("Repeated elements are : "); 
        for (i = 0; i < size; i++)  
        { 
            if (count[arr[i]] == 1) 
                System.out.print(arr[i] + " "); 
            else
                count[arr[i]]++; 
        } 
    }  

	public static void main(String[] args)  
	{ 
		Unique_Element repeat = new Unique_Element(); 
		int arr[] = {0, 7, 7, 5, 2, 3, 3, 0}; 
		int arr_size = arr.length; 
		repeat.printRepeating(arr, arr_size); 
		
	} 

}
