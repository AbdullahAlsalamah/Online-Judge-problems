import java.util.*;
import java.io.*;

public class p10324 {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(new FileInputStream("input.txt"));

		String str = kb.nextLine();
		int Case = 1;
		
		while (kb.hasNextLine()) {
			System.out.println(str);
			int n = kb.nextInt();
			
			System.out.println("Case " + Case + ":");
			
			for (int s = 0; s < n; s++) {
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

				int f = str.charAt(min);
				boolean yes = true;
				
				for (int k = min + 1; k <= max; k++) {
					if (f != str.charAt(k)) {
						yes = false;
						break;
					}
				}

				if (yes)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			
			
			str = kb.nextLine();
			Case++;
		}

		kb.close();
	}
}
