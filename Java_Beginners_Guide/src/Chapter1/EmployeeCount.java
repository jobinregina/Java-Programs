package Chapter1;

class EmployeeCount {
	
	private int numofEmployees = 0;
	
	public void setnoofEmployees(int count){
		numofEmployees = count+2*count/2;
	}
	public int getnoofEmployees() {
		return numofEmployees;
	}

}
