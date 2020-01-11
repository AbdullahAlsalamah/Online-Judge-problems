import java.util.*;
import java.io.*;

public class p00540 {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(new FileInputStream("text.txt"));

		int t = kb.nextInt();

		int sn = 1;
		while (t != 0) {
			System.out.println("Scenario #" + sn);
			LinkedList<Integer>[] teams = new LinkedList[t];

			for (int i = 0; i < teams.length; i++) {
				teams[i] = new LinkedList<Integer>();
				int members = kb.nextInt();
				for (int j = 0; j < members; j++) {
					teams[i].add(kb.nextInt());
				}
			}

			String str = kb.next();
			LinkedList<Integer> list = new LinkedList<Integer>();
//			for (int i = 0; i < teams.length; i++) {
//				System.out.println(teams[i].toString());
//			}

			while (!str.equals("STOP")) {

				if (str.equals("DEQUEUE")) {
					System.out.println(list.poll());
				} else if (str.equals("ENQUEUE")) {
					int input = kb.nextInt();

					int idx = indd(list, teams, input);
//					System.out.println("Printing = " + idx);
					if (idx == -1) {
						list.addLast(input);
					} else {
						list.add(idx+1, input);
					}

				}

				str = kb.next();
			}

			t = kb.nextInt();
			sn++;
			System.out.println();
		}

		kb.close();
	}

	public static int indd(LinkedList<Integer> list, LinkedList<Integer>[] teams, int n) {
		int idx = -1;
		for (int i = 0; i < teams.length; i++) {
			if (teams[i].contains(n)) {
				idx = i;
				break;
			}
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			if(teams[idx].contains(list.get(i))) {
				return i;
			}
		}
		
		
		
		return -1; 
	}

}
