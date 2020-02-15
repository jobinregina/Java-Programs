package Chapter5;

public class login {
	
	private String id; 
	private String password;
	
	//setter method for username
	public void setuser(String id) {
		
		this.id = id;
		id.concat("A");
		
	}
	
	//setter method for password
	public void setpass(String password) {
		
		this.password = password;
		password.concat("123");
	}
	
	//getter method for username
	public String getuser() {
		
		return id;
	}
	
	//getter method for password
	public String getpasswd() {
		
		return password;
	}
	
	
	public String same() {
		
		if(id.equals(password)||password.length()<8)return "Invalid";
		return "accepted";
	}
	
	public boolean check() {
		if(id.contains("A")) return true;
		return false;
	}

}
