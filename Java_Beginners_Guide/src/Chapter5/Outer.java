package Chapter5;

public class Outer {
	
	int nums[];
	
	Outer(int n[]){
		nums = n;
	}
	
	void analyze() {
		
		Inner ob = new Inner();
		
		System.out.println("Minimum: "+ ob.Min());
		System.out.println("Maximum: "+ ob.Max());
		System.out.println("Average: "+ ob.Avg());
	}
	
	// This is an inner class
	
	public class Inner {
		
		int Min() {
			
			int m = nums[0];
			
			for(int i=0; i<nums.length;i++ )
				if(nums[i]<m) m = nums[i];
			return m;
			
		}
		
		int Max() {
			
	int m = nums[0];
			
			for(int i=0; i<nums.length;i++ )
				if(nums[i]>m) m = nums[i];
			return m;
			
		}
		
		int Avg() {
			
	int a = nums[0];
			
			for(int i=0; i<nums.length;i++ )
				a += nums[i];
			return a;
			
		}
		
	}

}
