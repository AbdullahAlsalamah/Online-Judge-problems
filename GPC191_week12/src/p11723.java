import java.util.*;
public class p11723 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int R = kb.nextInt();
		int N = kb.nextInt();
		int c = 1;
		while(R != 0 || N != 0) {
			
			System.out.printf("Case %d: ", c);
			if((26*N + N) >= R) {
				int res = R/N;
				if(R%N == 0)
					res--;
				System.out.println(res);
			} else
				System.out.println("impossible");
			
			
			R = kb.nextInt();
			N = kb.nextInt();
			c++;
		}
		
		
		kb.close();
	}
}
