import java.util.*;
import java.io.*;
public class p10324x {
	public static void main(String[] args)throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		//String str = br.readLine();
		int Case = 1;
		
		while(kb.hasNext()) {
			String str = kb.nextLine();
			int n = kb.nextInt();//Integer.parseInt(br.readLine());
			System.out.println("Case " + Case + ":");
			for (int s = 0; s < n; s++) {
				//String r = br.readLine();
				//Scanner kb = new Scanner(r);
				
				int i = kb.nextInt();
				int j = kb.nextInt();
				
				int max, min;

				if (i > j) {
					max = i;
					min = j;
				} else {
					max = j;
					min = i;
				}
				String str1 = str.substring(min, max+1);
					
				if (str1.contains("0") && str1.contains("1"))
					System.out.println("No");
				else
					System.out.println("Yes");
			}
			str = kb.nextLine();
			//str = br.readLine();
			Case++;
		}
		
		
		
		//br.close();
		kb.close();
	}
}
