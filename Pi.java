package githubptc;

public class Pi {
	public static void main(String[] args) {
		float ans = 0;
		int n = 1;
		while(true) {
			float a = 0;
			a = (float) (1/ (double)(2*n-1));
			
			if(n>10000000) {
				break;
			}
			if (n%2 == 0)
				a = a*(-1);
			ans += a;
			n++;
		}
		System.out.println(4*ans);
	}
}
