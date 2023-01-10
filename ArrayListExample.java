package array;
import java.util.*;

public class ArrayListExample {
	public static void main(String arg[]) {
		int n = 4;
		ArrayList<Integer> arrlis = new ArrayList<Integer>(n);
		
		for( int i=0; i<=n; i++) {
			arrlis.add(i);
			
		}
		System.out.println(arrlis);
		
		arrlis.remove(2);
		
		System.out.println(arrlis);
		
	}

}
