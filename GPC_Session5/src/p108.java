import java.util.*;
import java.io.*;

public class p108 {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(System.in);
		
		do {
			int N = kb.nextInt();
			int[][] arr = new int[N][N];

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					arr[i][j] = kb.nextInt();
				}
			}
			System.out.println(MaxSumMatrix(arr));
			
		}while(kb.hasNextInt());
		kb.close();
	}
	
	public static int kadane(int[] arr) {
		int max = arr[0];
		int sum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			max = Math.max(max, sum);
		}
		return max;
	}
	
	
	public static int MaxSumMatrix(int[][] arr) {
		int max = Integer.MIN_VALUE;	
		
		int[] temp = new int[arr.length];
		
		for (int leftC = 0; leftC < arr[0].length; leftC++) {
			Arrays.fill(temp, 0);
			for (int rightC = leftC; rightC < arr[0].length; rightC++) {
				for (int i = 0; i < temp.length; i++) {
					temp[i] += arr[i][rightC];
				}
				max = Math.max(max, kadane(temp));
			}
		}
		
		return max;
	}
}
