import java.util.*;
import java.lang.*;
public class p11933 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		
		while(n != 0) {
			String a = "";
			String b = "";
			String binary = Integer.toBinaryString(n);
			boolean forA = true;
			for (int i = binary.length()-1; i >=0; i--) {
				if(forA &&  binary.charAt(i) == '1') {
					a = '1' + a;
					b = '0' + b;
					forA = !forA;
				} else if(!forA && binary.charAt(i) == '1'){
					b = '1' + b;
					a = '0' + a;
					forA = !forA;
				} else {
					a = "0" + a;
					b = "0" + b ;
				}
			}
			
			System.out.println(Integer.parseInt(a,2) + " " + Integer.parseInt(b,2));
			n = kb.nextInt();
		}
		
		kb.close();
	}
}
