import java.util.*;

public class p12015 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		LinkedList<String> res = new LinkedList<String>();
		
		int T = kb.nextInt();
		
		for (int i = 0; i < T; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < 10; j++) {
				String str = kb.next();
				int rev = kb.nextInt();
				if(rev == max)
					res.add(str);
				else if(rev > max) {
					res = new LinkedList<String>();
					res.add(str);
					max = rev;
				}
			}
			System.out.println("Case #"+ (i+1) + ":");
			while(!res.isEmpty()) {
				System.out.println(res.poll());
			}
		}
		
		
		
		kb.close();
	}
}
