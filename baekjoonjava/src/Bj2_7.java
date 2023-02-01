import java.util.*;
public class Bj2_7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int A, B, C ;

		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();


		if(A == B && B == C) {
			System.out.println(10000+(A*1000));
		}
		else if((A == B && B != C) || (A == C && A != B) || (B == C && A != B)) {
			if(A == B) {
				System.out.println(1000+(A*100));
			}
			else if(A == C) {
				System.out.println(1000+(A*100));
			}
			else {
				System.out.println(1000+(B*100));
			}
		}
		else {
			if(A > B && A > C) {
				System.out.println(A*100);
			}
			else if(B > A && B > C) {
				System.out.println(B*100);
			}
			else if(C > A && C > B) {
				System.out.println(C*100);
			}

		}

	}

}