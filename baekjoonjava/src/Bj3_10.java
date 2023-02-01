import java.util.*;

public class Bj3_10 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int A, B;

		for(int i=0; i<6; i++) {
			A = s.nextInt();
			B = s.nextInt();
			if(!(A==0 && B==0)) {

				System.out.println(A+B);
			}   
		}
	}
}