import java.util.*;

public class Bj3_12 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int B,C,D,N;
		N = s.nextInt();
		C = (N/10)+(N%10);
		B = N;
		D = 0;
		
		

		for(int i=1; i<100; i++) {
			
			D=(B%10)+(C%10) ;
			
			
			
		if((N/10)==(B%10) && (N%10)==(C%10)) {
			System.out.println(i);
			break;
		}
		else {
			B = C ;
			C = D ;
		}

			
		}   
	}

}