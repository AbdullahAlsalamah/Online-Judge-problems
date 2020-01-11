import java.util.*;
import java.io.*;

public class p10523VeryEasy {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("input.txt"));
		
		
		do {
			int N = kb.nextInt();
			int A = kb.nextInt();
			
			double value = summation(N,A);
			String result = value + "";
			System.out.println(value);
			
			while(result.contains("E")) {
				int pow = Integer.parseInt(result.substring(result.indexOf('E') + 1));
				double sub = Double.parseDouble(result.substring(0, result.indexOf('.')));
				String r = result.substring(0, result.indexOf('.')) + "";
				//System.out.println("\nresult = " + result);
				//System.out.println("Sub = " + sub * Math.pow(10, pow));
				System.out.print(r);
				value = value - (sub * Math.pow(10, pow));
				result = value + "";
			}
			
			System.out.print(result.substring(0, result.indexOf('.')));
			if(Integer.parseInt(result.substring(result.indexOf('.') + 1))  > 0) {
				System.out.println("X");
				System.out.println(result.substring(result.indexOf('.') + 1));
			} else
				System.out.println();
			
		} while(kb.hasNextInt());
		
		kb.close();
	}
	
	public static double summation(int N, int A) {
		Double result = 0.0;
		for (int i = 1; i <= N; i++) {
			result += i * Math.pow(A, i);
		}
		return result;
	}
}
