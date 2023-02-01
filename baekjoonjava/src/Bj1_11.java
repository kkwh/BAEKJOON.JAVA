import java.util.*;


public class Bj1_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A, B;
		
		A = s.nextInt();
		B = s.nextInt();
		
		
		
		System.out.println(A*(B%10));
		System.out.println(A*((B%100)/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
		
	

	}

}
