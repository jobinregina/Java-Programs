package Chapter5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class varArgs {
	
	// variable argument method
	
	static String vaTest(String msg, int...v) {
		return (msg+v.length);
		/*System.out.println("Contents: ");
		
		for(int i=0; i<v.length;i++) {
			System.out.println("arg "+ i + ":" + v[i]);
			
			System.out.println();
			
		}*/
	}
		
		public static void main (String args[]) {
			
			vaTest("One Vararg: ", 10);
			vaTest("Three Varargs: ", 1, 2, 3);
			vaTest("No Varargs: ");
			
		}
		
		@Test
		
		public void Varargtest() {
			
			Assert.assertEquals("One Vararg: 1", vaTest("One Vararg: ", 10));
		}
}
