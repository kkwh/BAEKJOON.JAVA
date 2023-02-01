import java.util.*;

public class Bj4_6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a ;
		int count = 0;
		int count1 = 0;
		int[] array = new int[10];


		for(int i=0; i<10; i++) {
			a = s.nextInt();
			array[i] = a%42 ;

		}
		for(int j=0; j<10; j++) {
			for(int z=j+1; z<10; z++ ) {
				if(array[j]== array[z]) {

					count++;

				}

			}
			if(count == 0) {
				count1++;
				count = 0 ;
			}
			else { count = 0; 
			} 
			
		} 
		System.out.println(count1);
		}
	}