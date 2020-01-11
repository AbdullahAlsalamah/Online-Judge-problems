import java.util.*; 
import java.io.*;
import java.math.*;
class Main {
	public static void main(String[] args)throws Exception{
		Scanner kb = new Scanner(new FileInputStream("input.txt"));
	//	PrintWriter pr = new PrintWriter(new FileOutputStream("output.txt"));
		do {
			int N = kb.nextInt();
			int A = kb.nextInt();
			
			//BigDecimal d = summation(N,A);
			BigInteger res = summation(N,A);
			System.out.println(res);
			//pr.println(res);
		} while(kb.hasNextInt());
	//	pr.close();
		kb.close();
	}
	
	
	public static BigInteger summation(int N, int A) {
		//Double result = 0.0;
		double r;
	//	BigInteger a = new BigInteger("1");
		BigInteger result = new BigInteger("0");
		//BigDecimal res = new BigDecimal("0.0");
		for (int i = 1; i <= N; i++) {
			//result += i * Math.pow(A, i);
			//res = res.add(BigDecimal.valueOf(i * Math.pow(A, i)));
			BigInteger tmp = BigInteger.valueOf(i).multiply(BigInteger.valueOf(A).pow(i));
			result = result.add(tmp);
		}
		
		return result;
	}
}
