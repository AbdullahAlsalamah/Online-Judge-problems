import java.util.*;
import java.io.*;

public class pp10281 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		int h = 0, m = 0, s = 0;
		int prevH, prevM, prevS;
		int speed = 0;
		double distance = 0;
		while(!input.isEmpty() && input != null && input != "") {
			String[] str = input.split(" ");
			
			prevH = h;
			prevM = m;
			prevS = s;
			
			h = Integer.parseInt(str[0].substring(0,2));
			m = Integer.parseInt(str[0].substring(3,5));
			s = Integer.parseInt(str[0].substring(6));
			
			/*double hDiff = h - prevH;
			double mDiff = m - prevM;
			double sDiff = s - prevS;*/
			double ttPrev = prevH*3600 + prevM * 60 + prevS;
			double tt = h*3600 + m*60 + s;
			
			double time = (tt - ttPrev)/3600;
			distance += time * speed;
			
			if(str.length == 2) {
				speed = Integer.parseInt(str[1]);
			} else if(str.length == 3) {
				speed = Integer.parseInt(str[2]);
			} else {
				
				System.out.printf("%s %.02f km\n", str[0], distance);
			}
			
			input = br.readLine();
		}
		
		
		br.close();
	}
}
