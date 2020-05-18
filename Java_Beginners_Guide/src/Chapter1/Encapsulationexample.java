package Chapter1;

public class Encapsulationexample {
	
	public static void main(String args[]) {
		
		EmployeeCount ec = new EmployeeCount();
		ec.setnoofEmployees(100);
		System.out.println("Employee Count is : " + ec.getnoofEmployees());
	}

}
