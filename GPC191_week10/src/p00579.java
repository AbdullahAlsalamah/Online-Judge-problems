import java.util.*;
import java.io.*;
public class p00579 {
	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int h = Integer.parseInt(str.substring(0, str.indexOf(":")));
		int m = Integer.parseInt(str.substring(str.indexOf(":")+1));
		
		while(h != 0 || m != 0) {
			double hdgree = h%12;
			hdgree = hdgree * 30 + m*0.5;
			double mdgree = m * 6;
			if(hdgree - mdgree > 180)
				System.out.printf("%.03f\n", (360+mdgree - hdgree));
			else if (mdgree - hdgree > 180)
				System.out.printf("%.03f\n", (360+hdgree - mdgree));
			else
				System.out.printf("%.03f\n", (Math.abs(hdgree - mdgree)));
			
			str = br.readLine();
			h = Integer.parseInt(str.substring(0, str.indexOf(":")));
			m = Integer.parseInt(str.substring(str.indexOf(":")+1));
		}
		
		
		
		br.close();
	}
}
