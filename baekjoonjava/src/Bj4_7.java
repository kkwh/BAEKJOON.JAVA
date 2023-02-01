import java.util.*;


public class Bj4_7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, score ;
		N = s.nextInt();
		int array[] = new int[N];

		for(int i=0; i<N; i++) {
			score = s.nextInt();
			array[i] = score ;
		}
        int M = 0;
        
		for(int j=0; j<N; j++) {
			if(array[j] > M) {
				M = array[j];
			}
		}
		int a[] = new int[N];
		
		for(int z=0; z<N; z++) {
			a[z] = (array[z] / M) * 100 ;

		}
		System.out.println(a[0]);
		int sum = 0;

		for(int t=0; t<N; t++) {
			sum += a[t];
		}
		

	    int sn = (sum/N) ;
		double k = (double) sn ;
		
		System.out.println(k);
		System.out.println(array[0]);
		System.out.println(a[0]);
		System.out.println(M);
//		System.out.println(sum);
	}
}