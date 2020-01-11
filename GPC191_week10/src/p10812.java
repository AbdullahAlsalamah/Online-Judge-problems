import java.util.*;

public class p10812 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int testCase = kb.nextInt();
		
		for (int i = 0; i < testCase; i++) {
			long s = kb.nextInt();
			long d = kb.nextInt();
			boolean get = false;
			if(d > s)
				System.out.println("impossible");
			else {
				for (long j = 0, k = s; j <= s/2; j++, k--) 
					if((j+k) == s && k-j == d) {
						System.out.println(k + " " + j);
						get = true;
						break;
					}
				if(!get)
					System.out.println("impossible");
			}
			
			
		}
	}
}
