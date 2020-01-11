import java.util.*;
import java.io.*;

public class p514_railway {
	public static void main(String[] args) throws Exception {
		Scanner kb = new Scanner(new FileInputStream("input.txt"));

		int Cases = kb.nextInt();
		Stack<Integer> stack;
		Stack<Integer> stack2;
		while (Cases > 0) {
			stack = new Stack<Integer>();
			stack2 = new Stack<Integer>();
			
			for (int i = Cases; i > 0; i--) {
				stack.push(i);
			}
			int in = kb.nextInt();
			while(in != 0) {
				for (int i = 0; i < stack.size(); i++) {
					stack2.push(stack.get(i));
				}
				Stack<Integer> stack3 = new Stack<Integer>();
				boolean test = true;
				for (int i = 1; i <= Cases; i++) {
					if(!stack2.isEmpty() && stack2.peek() == in) {
						stack2.pop();
					} else if(!stack3.isEmpty() && stack3.peek() == in) {
						stack3.pop();
					} else {
						while(!stack2.isEmpty()) {
							stack3.push(stack2.pop());
							if(!stack2.isEmpty() && stack2.peek() == in)
								break;
						}
						if(!stack2.isEmpty() && stack2.peek() == in)
							stack2.pop();
						else
							test = false;
					}
					in = kb.nextInt();
				}
				if(test)
					System.out.println("Yes");
				else
					System.out.println("No");
			}
			System.out.println();
			Cases = kb.nextInt();
		}

		kb.close();
	}
}
