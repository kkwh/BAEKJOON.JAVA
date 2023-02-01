import java.util.*;

public class Bj6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[26];
		String str ;
		str = sc.nextLine();

		for(int i=0; i<26; i++) {
			array[i] = -1 ; 

			for(int j=0; j<str.length(); j++) {
				char ch = str.charAt(j) ;

				if(array[ch-'a'] == -1) {
					array[ch-'a'] = j;
				}

			}
			System.out.print(array[i]+" ");
		}
	}
}