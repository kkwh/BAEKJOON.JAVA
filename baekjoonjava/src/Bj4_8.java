import java.util.Scanner;


public class Bj4_8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N ;
		String A;
		N = s.nextInt();
		String[] array = new String[N];
		int count = 0;
		
		for (int i=0; i<array.length; i++) {
			
			array[i] = s.nextLine();
		}
		System.out.println(array[2]);
//		for (int j=0; j<N; j++) {
//			if(array[j] == "O" ) { 
//				if(array[j] == array[j-1]) {
//					
//				}
//			}
//		}
//		System.out.println(array[0].charAt(0));
//		System.out.println(array[0]);
	}
}