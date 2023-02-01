import java.util.*;
public class Bj2_6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int A, B, C ;
		
		A = s.nextInt();
		B = s.nextInt();
		C = s.nextInt();
		
		
		if(B+C >= 60) {
			if(A+((B+C)/60) > 23) {
				System.out.println(((A+((B+C)/60)-24)+" "+((B+C)%60)));
			}
			else {
				System.out.println(A+((B+C)/60)+" "+((B+C)%60));
			}
		}
		else {
			System.out.println(A+" "+(B+C));
		}
		
		
	}

}