import java.util.*;

public class p11727 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int numCases = kb.nextInt();
		
		for (int i = 0; i < numCases; i++) {
			int[] s = new int[3];
			
			for (int j = 0; j < s.length; j++) {
				s[j] = kb.nextInt();
			}
			
			Arrays.sort(s);
			
			System.out.println("Case " + (i+1) + ": " + s[1]);
		}
		
		kb.close();
	}
}
