import java.util.*;

public class Bj4_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N, input, max, min ;
		N = s.nextInt();
		int[] array = new int[N];

		for(int i=0; i<N; i++) {
			input = s.nextInt();
			array[i] = input ;
		}   
		max = -1000000;
		min = 1000000;

		for(int j=0; j<N; j++) {
			if(array[j] > max) {
				max = array[j];
			}
			else if(array[j] < min ) {
				min = array[j];
			}
		}

		System.out.println(min+" "+max);



	}
}
