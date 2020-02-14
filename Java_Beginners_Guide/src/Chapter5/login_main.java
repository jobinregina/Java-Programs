package Chapter5;

public class login_main {
	
	public static void main(String args[]) {
		
		login ob = new login();
		ob.setuser("user1");
		ob.setpass("password1"); 
		System.out.println(ob.same());
		
	}

}
