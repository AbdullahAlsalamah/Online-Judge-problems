import java.util.*;
import java.io.*;

public class p10038 {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		
		while(kb.hasNext()) {
			int n = kb.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = kb.nextInt();
			}
			if(ss(arr, n)) {
				System.out.println("Jolly");
			} else {
				System.out.println("Not jolly");
			}
		}
		
		kb.close();
	}
	
	
	public static boolean ss(int[] arr, int n) {
		boolean[] c = new boolean[n-1];
		for (int i = 0; i < arr.length - 1; i++) {
			int mm = Math.abs(arr[i] - arr[i+1]);
			if(mm >= n || mm == 0) 
				return false;
			c[mm - 1] = true;
		}
		
		for (int i = 0; i < c.length; i++) 
			if(!c[i])
				return false;
		
		return true;
	}
	
	
}
