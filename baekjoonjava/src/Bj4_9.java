import java.util.Scanner;

public class Bj4_9 {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int C,N,L ;
    int[] array ;
    C = s.nextInt();
    
    
    for(int i=0; i<C; i++) {
    	
    	N = s.nextInt();
    	array = new int[N];
    	double sum = 0;
    	
    	for(int j=0; j<N; j++) {
    		L = s.nextInt();
    		array[j] = L;
    		sum += L;
    	}
    	
    	double M = (sum / N) ;
    	double count = 0;
    	
    	for(int t=0; t<N; t++ ) {
    		if(array[t] > M) {
    			count++;
    		}
    	} 
    	
    	System.out.printf("%.3f%%%n",(count/N)*100);
    }
		
	}
	
}