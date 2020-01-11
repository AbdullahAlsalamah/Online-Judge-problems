import java.util.*;

public class p514 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int input;
		do {
			input = kb.nextInt();
			if (input != 0) {
				Stack<Integer> stack = new Stack<Integer>();
				for (int i = input; i > 0; i--) {
					stack.push(i);
				}
				Queue<Integer> queue = new LinkedList<Integer>();
				int seq = 0;
				do {
					for (int i = 1; i <= input; i++) {
						seq = kb.nextInt();
						// System.out.print(" seq = " + seq);
						if (seq == 0 && i == 1)
							break;

						if (seq >= 1 && seq <= input) {
							queue.add(seq);
						} else {
							System.out.println("Error: Invalid Input...");
							System.exit(0);
						}
					}
					// System.out.println("Stack and Queue");
					// for (int i = 0; !queue.isEmpty(); i++) {
					// System.out.println("Stack element: " + stack.get(i) + "\tQueue element: " +
					// queue.poll());
					// }
					if (seq >= 1 && seq <= input)
						System.out.println(test(stack, queue));
				} while (seq != 0);
				System.out.println();
			}

		} while (input != 0);

		/*
		 * for (int i = 0; i < res.size(); i++) { System.out.println(res.get(i)); }
		 */

		kb.close();
	}

	public static String test(Stack<Integer> s, Queue<Integer> q) {
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();
		for (int i = 0; i < s.size(); i++) {
			s3.push(s.get(i));
		}
		// boolean good = true;
		
		while (!s3.isEmpty() || !s2.isEmpty()) {
			if (!s3.isEmpty() && !q.isEmpty() && s3.lastElement() == q.peek()) {
			//	System.out.println("Stack lastElement " + s3.pop());
				//System.out.println("Queue peek " + q.poll());
				s3.pop();
				q.poll();
			} else if (!s2.isEmpty() && !q.isEmpty() && s2.lastElement() == q.peek()) {
				//System.out.println("2-Stack lastElement " + s2.pop());
				//System.out.println("2-Queue peek " + q.poll());
				s2.pop();
				q.poll();
			} else if (!s3.isEmpty()) {
				s2.push(s3.pop());
				//System.out.println("3- stack last Element = " + s2.lastElement());
			} else {
				return "No";
			}
		}

		return "Yes";
	}
}
