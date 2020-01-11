import java.util.*;
import java.io.*;

class Main {
	public static void main(String[] args)throws Exception{
		Scanner kb = new Scanner(System.in);
			int hight = kb.nextInt();
			int testNum = 0, intercept;
			
			while(hight > -1) {
				ArrayList<Integer>[] arr = new ArrayList[2];
				testNum++;
				arr[0] = new ArrayList<Integer>();
				arr[1] = new ArrayList<Integer>();
				while(hight > -1) {
					arr[0].add(hight);
					arr[1].add(0);
					hight = kb.nextInt();
				}
				//System.out.printf("Test #%d:\n", testNum);
				System.out.println("Test #" + testNum + ":");
				System.out.println("  maximum possible interceptions: " + x(arr));
				hight = kb.nextInt();
				if(hight > -1)
					System.out.println();
			}
		kb.close();
	}
	
	
	public static int x(ArrayList<Integer>[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = arr[0].size()-1; i >= 0; i--) {
			int y = Integer.MIN_VALUE;
			for (int j = i+1; j < arr[0].size(); j++) {
				if(arr[0].get(j) <= arr[0].get(i) && arr[1].get(j) > y) {
					y = arr[1].get(j);
				}
			}
			if(y < 1)
				arr[1].set(i, 1);
			else
				arr[1].set(i, y+1);
		}
		for (int i = 0; i < arr[1].size(); i++) {
			if(arr[1].get(i) > max) {
				max = arr[1].get(i);
			}
		}
		
		return max;
	}
}
