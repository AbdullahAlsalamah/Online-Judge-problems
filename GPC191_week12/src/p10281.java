import java.util.*;
import java.io.*;
public class p10281 {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		int h = 0, m = 0, s = 0;
		int prevH, prevM, prevS;
		int speed = 0;
		double distance = 0;
		while(kb.hasNext()) {
			String str = kb.nextLine();
			prevH = h;
			prevM = m;
			prevS = s;
			
			h = Integer.parseInt(str.substring(0,2));
			m = Integer.parseInt(str.substring(3,5));
			s = Integer.parseInt(str.substring(6, 8));
			
			double ttPrev = prevH*3600 + prevM * 60 + prevS;
			double tt = h*3600 + m*60 + s;
			
			double time = (tt - ttPrev)/3600;
			distance += time * speed;
			
			if(str.length() >= 10) {
				speed = Integer.parseInt(str.substring(9));
			} else {
				System.out.printf("%s %.02f km\n", str.substring(0,8), distance);
			}
			
		}
		
		
		kb.close();
	}
}
