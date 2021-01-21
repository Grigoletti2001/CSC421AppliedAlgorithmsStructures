import java.util.*;
import java.util.stream.Collectors;
public class Batmanacci {
	static int n;
	static long k;
	static long[] array;
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 n = in.nextInt();
		 k = in.nextLong();
		 if (n > 90) {
		 if (n%2 == 0) {
			 n = 90;
		 } else {
			 n = 89;
		 }
		 }
		 array = new long[91];
		 int num = 1;
		 array[1] = 1;
		 array[2] = 1;
		 for (int i = 3; i < 91; i++) {
			 array[i] = array[i-1] + array[i-2];
		 }
		 System.out.println(function(n));
		 
	}
	
	public static String function(int n) {
		if (n == 1) {
			return "N";
		} else if (n==2) {
			return "A";
		} else {
			if (k > array[n-2]) {
				k -= array[n-2];
				n -= 1;
			
				
			} else {
				n-= 2;
			}
			return function(n);
		}
	}


	
	
}
