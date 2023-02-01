import java.util.*;

public class Bj4_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, X, N2;
		N = s.nextInt();
		X = s.nextInt();
		int[] array = new int[N];

		for(int i=0; i<N; i++) {
			N2 = s.nextInt();
			array[i] = N2;
		}
		for(int j=0; j<N; j++) {
			if(array[j] < X ) {
				System.out.print(array[j]+" ");

			}
		}

	}
}
