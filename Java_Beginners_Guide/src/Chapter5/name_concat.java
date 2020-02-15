package Chapter5;
// use of getter and setter method- put checks to input values
public class name_concat {
	
	private String firstname;
	private int age;
	private double salary;
	
	public void setfirst(String f) {
		if (f.contains("@")) {
			throw new IllegalArgumentException();
		}
		this.firstname = f;
	}
	
	public void setsalary(double s) {
		if (s<0||s>1000000) {
			throw new IllegalArgumentException();
		}
		this.salary = s;
	}

	public void setage(int a) {
		if (a<0||a>100) {
			throw new IllegalArgumentException();
		}
		this.age = a;
	}
	
	public String getfirst() {
		return firstname;
	}
	
	public int getage() {
		return age;
	}
	
	public double getsalary() {
		return salary;
	}

	
	public void display() {
		System.out.print(firstname+"  " + age+ "  "+ salary);
	}

}
