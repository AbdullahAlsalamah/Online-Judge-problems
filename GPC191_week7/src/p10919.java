import java.util.*;
public class p10919 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int k = kb.nextInt();
		
		while(k != 0) {
			int m = kb.nextInt();
			
			LinkedList<Integer> courses = new LinkedList<Integer>();
			for (int i = 0; i < k; i++) {
				courses.add(kb.nextInt());
			}
			
			boolean willgrad = true;
			for (int i = 0; i < m; i++) {
				int c = kb.nextInt();
				int r = kb.nextInt();
				int okay = 0;
				for (int j = 0; j < c; j++) {
					int course = kb.nextInt();
					if(courses.contains(course))
						okay++;
				}
				if(okay < r)
					willgrad = false;
			}
			
			if(willgrad)
				System.out.println("yes");
			else
				System.out.println("no");
		
			k = kb.nextInt();
		}
		
		
		
		kb.close();
	}
}
