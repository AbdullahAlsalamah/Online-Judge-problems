import java.util.*;
import java.math.*;
import java.io.*;
public class p10523 {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		
		while(kb.hasNext()) {
			int N = kb.nextInt();
			int A = kb.nextInt();
			System.out.println(ss(N, A));
		}
		
		
		kb.close();
	}
	
	public static String ss(int N, int A) {
		BigInteger bg = new BigInteger("0");
		BigInteger bg2;
		for (int i = 1; i <= N; i++) {
			bg2 = new BigInteger("" + A);
			bg2 = bg2.pow(i);
			bg2 = bg2.multiply(new BigInteger("" + i));
			
			bg = bg.add(bg2);
		}
		return bg.toString();
	}
}
