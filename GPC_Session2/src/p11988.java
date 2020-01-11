import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.*;

public class p11988 {
	public static void main(String[] args)throws Exception {
		//Scanner kb = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = "";
		char[] chars;
		do {
			//word = kb.nextLine(); 
			word = br.readLine();
			LinkedList<Character> link = new LinkedList<Character>();
			chars = word.toCharArray();
			for (int i = 0; i < chars.length; i++) {
				if(chars[i] == ']')
					continue;
				if (chars[i] == '[') {
					i++;
					for (int j = 0; i < chars.length && chars[i] != '[' && chars[i] != ']'; j++, i++) {
						link.add(j, chars[i]);
					}
					i--;
					continue;
				}
				link.addLast(chars[i]);
			}
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < link.size(); i++) {
				//System.out.print(link.get(i));     //Use String Builder
				str.append(link.get(i));
			}
			
			System.out.println(str.toString());
	
			//System.out.println();
		} while (!word.isEmpty());
		br.close();
		//kb.close();
	}
}

