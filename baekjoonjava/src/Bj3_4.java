import java.util.*;

public class Bj3_4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int X, N, a, b ;
		int sum = 0 ;
		
		X = s.nextInt();
		N = s.nextInt();
		
			for(int i=0; i<N; i++) {
				a = s.nextInt();
				b = s.nextInt();
				sum += a*b ; 
			}
			
			if(X == sum) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
		
	}
	
}