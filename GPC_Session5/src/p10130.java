import java.util.*;

public class p10130 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int T = kb.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = kb.nextInt();
			int[][] items = new int[2][N];
			for (int j = 0; j < N; j++) {
				items[0][j] = kb.nextInt();
				items[1][j] = kb.nextInt(); 
			}
			int[] G = new int[kb.nextInt()];
			for (int j = 0; j < G.length; j++) {
				G[j] = kb.nextInt();
			}
			int[] Gvalue = new int[G.length];
			for (int j = 0; j < Gvalue.length; j++) {
				Gvalue[j] = maxWeight(items, G[j]);
			}
			int sum = 0;
			for (int j = 0; j < Gvalue.length; j++) {
				sum += Gvalue[j];
			}
			System.out.println(sum);
		}
		
		kb.close();
	}
	
	public static int maxWeight(int[][] items, int Capacity) {
		int[][] V = new int[items[0].length+1][Capacity+1];
		for (int i = 0; i < V.length; i++) {
			V[i][0] = 0;
		}
		for (int i = 0; i < V[0].length; i++) {
			V[0][i] = 0;
		}
		for (int i = 1; i < V.length; i++) {
			for (int j = 1; j < V[i].length; j++) {
				if(items[1][i-1] > j) {
					V[i][j] = V[i-1][j];
				} else {
					V[i][j] = Math.max(V[i-1][j], V[i-1][j-items[1][i-1]] + items[0][i-1]);
				}
			}
		}
		return V[items[0].length][Capacity];
	}
}
