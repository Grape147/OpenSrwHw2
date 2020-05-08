
public class Pi_Euler {
	public static void main(String[] args) {
		float ans = 0;
		int n = 1;
		while(true) {
			float a = 0;
			a = (float) (1/ (float)(n*n));
			
			if(a<0.0000001) {
				break;
			}
			ans += a;
			n++;
		}
		
		System.out.printf("%.5f", Math.sqrt(6*(ans)));
	}
}
