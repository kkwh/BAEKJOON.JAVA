import java.util.*;

public class Bj4_5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n ;
		boolean[] array = new boolean[31];
		
		for(int i=0; i<28; i++) {
			array[s.nextInt()] = true;
		  
		}
		
		for(int j=1; j<=30; j++) {
			if(array[j] != true) {
				System.out.println(j);
			}


		}
	}
}