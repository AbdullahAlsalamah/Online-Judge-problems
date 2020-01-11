import java.util.*;
import java.io.*;

public class p514_23FEB {
	public static void main(String[] args)throws Exception {
		Scanner kb = new Scanner(new FileInputStream("input.txt"));
		
		int Cases = kb.nextInt();
		Stack<Integer> stack;
		//Queue<Integer> queue;
		Stack<Integer> stack2;
		while(Cases > 0) {
			stack = new Stack<Integer>();
			//queue = new LinkedList<Integer>();
			stack2 = new Stack<Integer>();
			
			for (int i = Cases; i > 0; i--) {
				stack.push(i);
			}
			int in = kb.nextInt();
			//System.out.println(in);
			while(in != 0) {
				//queue.add(in);
				stack2.push(in);
				for (int i = 1; i < Cases; i++) {
					//queue.add(kb.nextInt());
					stack2.push(kb.nextInt());
				}
				System.out.println(test(stack, stack2));
				in = kb.nextInt();
			}
			
			System.out.println();
			Cases = kb.nextInt();
		}
		
		
		kb.close();
	}
	
	public static String test(Stack<Integer> stack, Stack<Integer> stack2) {
		Stack<Integer> s = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();

	//	System.out.println("Stack");
		for (int i = 0; i < stack.size(); i++) {
			//System.out.print(stack.get(i) + " ");
			s2.push(stack.get(i));
		}
/*
		System.out.println();
		System.out.println("Stack2");
		for (int i = 0; i < stack.size(); i++) {
			System.out.print(stack2.get(i) + " ");
		}
	//	int n = stack2.pop();
		System.out.println("PP = " + stack2.peek());
		//stack2.push(n);
		//n = stack.pop();
		System.out.println("PP2 = " + stack.peek());
		//stack.push(n);
*/		
		while(!s2.isEmpty() || !s.isEmpty()) {
			if(!s2.isEmpty() && s2.peek() == stack2.peek()) {
				System.out.println("popS2 = " + s2.pop());
				System.out.println(stack2.pop());
			} else if(!s.isEmpty() && s.peek() == stack2.peek()) {
				System.out.println("popS = " + s.pop());
				System.out.println(stack2.pop());
			} else if(!s2.isEmpty()) {
				s.push(s2.pop());
				System.out.println("Speek = " + s.peek());
			} else
				return "No";
		}
		
		return "Yes";
	}
}
