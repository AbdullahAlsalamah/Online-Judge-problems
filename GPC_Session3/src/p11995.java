import java.util.*;
import java.io.*;

public class p11995 implements Comparator {
	public static void main(String[] args)throws Exception{
			Scanner kb = new Scanner(new FileInputStream("input.txt"));
			PriorityQueue pQueue;
			Stack stack;
			Queue queue;
			
		//	int Cases = kb.nextInt();
			do {
			//	System.out.println(Cases);
				int numCase = kb.nextInt();
				//int numCase = Integer.parseInt(Cases);
				boolean checkStack = true, checkQueue = true, checkPQueue = true;
				int inputNum = 0;
				
				pQueue = new PriorityQueue(new p11995());
				stack = new Stack();
				queue = new LinkedList();

				for (int i = 0; i < numCase; i++) {
					int command = kb.nextInt();
					int value = kb.nextInt();
					
					if(command == 1) {
						inputNum++;
						pQueue.add(value);
						stack.push(value);
						queue.add(value);
					} else if(command == 2 && inputNum > 0) {
						inputNum--;
						if(value != (int)pQueue.poll())
							checkPQueue = false;
						if(value != (int)queue.poll())
							checkQueue = false;
						if(value != (int)stack.pop())
							checkStack = false;
					} else if(inputNum <= 0) {
						checkPQueue = false;
						checkQueue = false;
						checkStack = false;
					}
				}
				kb.nextLine();
				if((checkPQueue && checkQueue) || (checkPQueue && checkStack) || (checkStack && checkQueue)) {
					System.out.println("not sure");
				} else if (checkStack) {
					System.out.println("stack");
				} else if(checkQueue) {
					System.out.println("queue");
				} else if(checkPQueue) {
					System.out.println("priority queue");
				} else {
					System.out.println("impossible");
				}
				//Cases = kb.nextLine();
			} while(kb.hasNextLine());
			
			kb.close();
	}

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		return ((int)arg1 - (int)arg0);
	}
}
