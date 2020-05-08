
public class Pi_Ramanujan {
	public static void main (String[] args) {
		float ans = 0;
		int n = 0;
		float ans2 = 0;
		while(true) {
			if(n>100) {
				break;
			}
			float a = 0;
			a = (float) (factorial(4*n)*(1103 + 26390 * n) 
					/ (Math.pow(factorial(n), 4)*Math.pow(396, 4*n)));
			ans2 += a;
			//System.out.println(ans2);
			n++;
			
		}
		ans = (float) (1/(Math.sqrt(8)/9801*ans2));
		
		System.out.println(ans);
	}
	static int factorial(int num) {
	    int ans = 1;
		if (num != 1 && num != 0) {
	      ans = ans * num;
	      num--;
	      factorial(num);
	    }
		return ans;
		
	}

}
