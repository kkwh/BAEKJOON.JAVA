import java.util.*;

public class Bj4_4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int A, max, count ;
		max = 0;
		count = 0;
		int[] array = new int[9];

		for(int i=0; i<9; i++) {
			A = s.nextInt();
			array[i] = A ;
		}

		for(int j=0; j<9; j++) {
			if(array[j] > max) {
				max = array[j];
				count = (j+1);
			}
		}
		System.out.println(max);
		System.out.println(count);


	}
}