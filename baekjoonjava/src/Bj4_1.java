import java.util.*;

public class Bj4_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, N1, N2;
		N = s.nextInt();
		int[] array = new int[N];
		int count = 0 ;

		for(int i=0 ; i<N; i++) {
			N1 =s.nextInt();
			array[i] = N1;
		}
		N2 = s.nextInt();

		for(int j=0; j<N; j++) {
			if(array[j] == N2 ) {
				count++;
			}

		}
		System.out.println(count);
	}
}
