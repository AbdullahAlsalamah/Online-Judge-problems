import java.util.*;
import java.io.*;

public class p11995_GuessDS implements Comparator {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue pQueue;
		Stack stack;
		Queue queue;
		int Cases;
		do {
			String word = br.readLine();
			if(word == null || word.isEmpty() || word == "")
				break;
			Cases = Integer.parseInt(word); //kb.nextInt();
			boolean checkStack = true, checkQueue = true, checkPQueue = true;
			int inputNum = 0;

			pQueue = new PriorityQueue(new p11995_GuessDS());
			stack = new Stack();
			queue = new LinkedList();

			if (Cases >= 0) {

				for (int i = 0; i < Cases; i++) {
					word = br.readLine();
					Scanner r = new Scanner(word);
					int command = r.nextInt();//kb.nextInt();
					int value = r.nextInt();//kb.nextInt();

					if (command == 1) {
						inputNum++;
						pQueue.add(value);
						stack.push(value);
						queue.add(value);
					} else if (command == 2 && inputNum > 0) {
						inputNum--;
						if (value != (int) pQueue.poll())
							checkPQueue = false;
						if (value != (int) queue.poll())
							checkQueue = false;
						if (value != (int) stack.pop())
							checkStack = false;
					}
				}

				if ((checkPQueue && checkQueue) || (checkPQueue && checkStack) || (checkStack && checkQueue)) {
					System.out.println("not sure");
				} else if (checkStack) {
					System.out.println("stack");
				} else if (checkQueue) {
					System.out.println("queue");
				} else if (checkPQueue) {
					System.out.println("priority queue");
				} else {
					System.out.println("impossible");
				}
			}
		} while (true);
	}

	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return ((int) arg1 - (int) arg0);
	}
}
