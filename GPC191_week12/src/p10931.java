import java.util.*;
import java.lang.*;
public class p10931 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int I = kb.nextInt();
		
		while(I != 0) {
			String binary = Integer.toBinaryString(I);
			int count = 0;
			for (int j = 0; j < binary.length(); j++) {
				if(binary.charAt(j) == 49) {
					count++;
				}
			}
			
			System.out.printf("The parity of %s is %d (mod 2).\n", binary, count);
			
			
			
			I = kb.nextInt();
		}
		
		kb.close();
	}
}
