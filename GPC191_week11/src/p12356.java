import java.util.*;
import java.io.*;
//Time limit exceeded
public class p12356 {
	public static void main(String[] args)throws Exception {
		//Scanner kb = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//int S = kb.nextInt();
		//int B = kb.nextInt();
		String[] str = br.readLine().split(" ");
		int S = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		
		while(S != 0 && B != 0) {
			
			boolean[] s = new boolean[S];
			
			Arrays.fill(s, Boolean.TRUE);
			for (int i = 0; i < B; i++) {
				//int L = kb.nextInt()-1;
				//int R = kb.nextInt()-1;
				str = br.readLine().split(" ");
				int L = Integer.parseInt(str[0])-1;
				int R = Integer.parseInt(str[1])-1;
				
				for (int j = L; j <= R; j++) 
					s[j] = false;
				
				for (int j = L; j >= 0; j--) {
					if(s[j]) {
						System.out.print(j+1 + " ");
						break;
					} else if(j == 0)
						System.out.print("* ");
						
				}
				
				for (int j = R; j <= s.length-1; j++) {
					if(s[j]) {
						System.out.println(j+1);
						break;
					} else if (j == s.length - 1)
						System.out.println("*");
				}
				
			}
			System.out.println("-");
			
			str = br.readLine().split(" ");
			S = Integer.parseInt(str[0]);
			B = Integer.parseInt(str[1]);
			//S = kb.nextInt();
			//B = kb.nextInt();
		}
		//kb.close();
		br.close();
	}
}
