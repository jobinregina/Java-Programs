package Datasructures;

public class findnumber_platform_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arv[] = {1:00, 1:40, 1:50, 2:00, 2:15, 4:00}
		// dp[] = {1:10, 2:20, 2:30, 3:00, 3:15, 6:00}
 
		int arv[] = {100, 140, 150, 200, 215, 400};
		int dp[] = {110, 300, 220, 230,315, 600};
		findnumber_platform fnp = new findnumber_platform(arv, dp, arv.length);
		System.out.println("Max platforms needed is: "+fnp.findplatform());

	}

}
