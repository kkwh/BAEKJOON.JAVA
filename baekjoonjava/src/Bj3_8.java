import java.util.*;

public class Bj3_8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N;

		N = s.nextInt();

		for(int i=0; i<N; i++) {
			for(int j=0; j<=i ; j++) {
				System.out.print("*");
			}
                System.out.println();
		}

	}

}