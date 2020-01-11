import java.util.*;

public class p12356x {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int S = kb.nextInt();
		int B = kb.nextInt();
		
		while(S != 0 && B != 0) {
			
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			for (int i = 1; i <= S; i++) {
				list.add(i);
				
			}
			
			
			
			
			S = kb.nextInt();
			B = kb.nextInt();
		}
		kb.close();
	}
}
