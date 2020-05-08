
public class Pi_John {
	public static void main (String[] args) {
		float ans = 1;
		int n = 1;
		while(true) {
			if(n>10000) {
				break;
			}
			float a = 1;
			if(n%2 == 1) {
				a = (float) n / (float) (n+1);
			}
			else {
				a = (float) (n+1) / (float) n;
			}
			ans = ans * a;
			n++;
		}
		
		System.out.println(2/ans);
	}
}
