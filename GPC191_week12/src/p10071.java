import java.util.*;
import java.io.*;
public class p10071 {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		
		
		
		while(kb.hasNext()) {
			int v = kb.nextInt();
			int t = kb.nextInt();
			
			System.out.println(2*v*t);
		}
		
		
		
		
		
		kb.close();
	}
}
