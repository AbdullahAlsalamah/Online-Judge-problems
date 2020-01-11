import java.util.*;

public class p11034 {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(System.in);

		int t = kb.nextInt();
		for (int i = 0; i < t; i++) {
			int l = kb.nextInt() * 100;
			int m = kb.nextInt();
			LinkedList<Integer> left = new LinkedList<Integer>();
			LinkedList<Integer> right = new LinkedList<Integer>();
			boolean leftSide = true;
			for (int j = 0; j < m; j++) {
				int cL = kb.nextInt();
				if (kb.next().equals("left")) {
					left.add(cL);
				} else {
					right.add(cL);
				}
			} 
			int count = 0;
			while (!left.isEmpty() || !right.isEmpty()) {
				int nn = 0;
				if (leftSide) {
					int k = 0;
					while (nn < l && !left.isEmpty()) {

						if (left.get(k) + nn <= l) {
							nn += left.get(k);
							left.remove(k);
						} else
							k++;
						if (k == left.size())
							break;
					}
				} else {
					int k = 0;
					while (nn < l && !right.isEmpty()) {
						if (right.get(k) + nn <= l) {
							nn += right.get(k);
							right.remove(k);
						} else
							k++;
						if (k == right.size())
							break;
					}
				}
				if (left.size() == 0)
					leftSide = false;
				else if (right.size() == 0)
					leftSide = true;
				else
					leftSide = !leftSide;
				count++;

			}
			System.out.println(count);
		}

		kb.close();
	}
}
