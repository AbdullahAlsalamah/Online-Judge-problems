import java.util.*;
import java.io.*;

public class p10346 {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		
		
		
		while(kb.hasNext()) {
			int n = kb.nextInt();
			int k = kb.nextInt();
			int countN = n;
			int butts = n;
			n = butts / k;
			butts = butts % k;
			while(n != 0) {
				countN += n;
				butts += n;
				n = butts / k;
				butts = butts % k;
			}
			
			System.out.println(countN);
		}
		
		
		
		
		
		kb.close();
	}
}
