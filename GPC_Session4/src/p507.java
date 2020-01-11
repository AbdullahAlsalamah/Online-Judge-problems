import java.util.*;

public class p507 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int b = kb.nextInt();
		for (int i = 0; i < b; i++) {
			int s = kb.nextInt();
			int[] n = new int[s - 1];
			for (int j = 0; j < n.length; j++) {
				n[j] = kb.nextInt();
			}
			
			int[] r = nicenessRoute(n);
			if(r[0] == -1 && r[1] == -1) {
				System.out.println("Route " + (i+1) + " has no nice parts");
			} else {
				System.out.println("The nicest part of route " + (i+1) + " is between stops " + (r[0]+1) + " and " + (r[1]+2));
			}
		}

		kb.close();
	}
	
	public static int[] nicenessRoute(int[] arr) {
		int max = Integer.MIN_VALUE;
		int index1 = 0, index2 = 0;
		int start = 0;
		int sum = 0;
		boolean f = false;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
			if(max < sum) {
				max = sum;
				index1 = start;
				index2 = i;
				f = true;
			} else if(sum == max && f) {
				index2 = i;
			} else if( max <= sum && ((i - start) > (index2 - index1))) {
				max = sum;
				index1 = start;
				index2 = i;
				f = true;
			}
			
			if(sum < 0) {
				sum = 0;
				start = i+1;
				f = false;
			}
		}
		if( max > 0) {
			int[] r = {index1, index2};  
			return r ;
		}else {
			int[] r = {-1, -1};  
			return r ;
		}
	}
}
