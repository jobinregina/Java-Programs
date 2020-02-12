package Chapter1;

public class factorial {
	
	int fact(int n) {
		
		if (n==0) return 1;
		else return (fact(n-1)*n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial f = new factorial();
		int n = 25;
		System.out.println("factorial of " + n+ " is: "+ f.fact(n));

	}

}
