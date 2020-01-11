import java.util.*;
public class p11498 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int K = kb.nextInt();
		
		while(K != 0) {
			int N = kb.nextInt();
			int M = kb.nextInt();
			
			for (int i = 0; i < K; i++) {
				int X = kb.nextInt();
				int Y = kb.nextInt();
				
				System.out.println(o(N, M, X, Y));
			}
			
			
			
			K = kb.nextInt();
		}
		
		
		
		kb.close();
	}
	
	
	public static String o(int N, int M, int X, int Y) {
		
		if(X == N || Y == M) {
			return "divisa";
		} 
		
		if(X > N && Y > M) {
			return "NE";
		} else if (X < N && Y > M){
			return "NO";
		} else if(X < N && Y < M) {
			return "SO";
		} else {
			return "SE";
		}
		
		
	}
}
