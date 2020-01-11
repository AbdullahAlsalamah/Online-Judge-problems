import java.util.*;
import java.io.*;

public class p11340 {
	public static void main(String[] args)throws Exception {
		//Scanner kb = new Scanner(System.in);
		//Scanner kb = new Scanner(new FileInputStream("text.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int testCases = kb.nextInt();
		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {
			//int K = kb.nextInt();
			int K = Integer.parseInt(br.readLine());
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (int j = 0; j < K; j++) {
				String[] str = br.readLine().split(" ");
				map.put(str[0].charAt(0), Integer.parseInt(str[1]));//map.put(kb.next().charAt(0), kb.nextInt());
			}
			
			//int M = kb.nextInt();
			//kb.nextLine();
			int M = Integer.parseInt(br.readLine());
			long sum = 0;
			for (int j = 0; j < M; j++) {
				String str = br.readLine();//kb.nextLine();
				for (int l = 0; l < str.length(); l++) 
					if(map.containsKey(str.charAt(l)))
						sum += map.get(str.charAt(l));
				
			}
			
		
			
			System.out.printf("%.2f$\n",sum/100.0);
			
		}
		
		
		//kb.close();
		br.close();
	}
}
