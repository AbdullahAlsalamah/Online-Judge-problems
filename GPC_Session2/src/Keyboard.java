import java.util.*;
//import java.util.LinkedList;
class Keyboard {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String sen;
		ArrayList<String> res = new ArrayList<String>();
		do {
			
			LinkedList<Character> link = new LinkedList<Character>();
			sen = kb.nextLine();
			
			if(!sen.isEmpty()) {
				link = sol(sen);
				String result = "";
				for (int i = 0; i < link.size(); i++) {
					result += link.get(i);
				}
				res.add(result);
			}		
		} while(!sen.isEmpty());
		
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
		
		kb.close();
	} 
	
	
	public static LinkedList<Character> sol(String sen){
		LinkedList<Character> link = new LinkedList<Character>();
		boolean open = false, close = false;
		
		for (int i = 0; i < sen.length(); i++) {
			if(sen.charAt(i) == '[') {
				open = true;
				close = false;
				continue;
			}
			if(sen.charAt(i) == ']') {
				open = false;
				close = true;
				continue;
			}
			
			if(open) {
				String word = "";
				boolean test = false;
				for (; i < sen.length() ; i++) {
					if(sen.charAt(i) == '[' || sen.charAt(i) == ']') {
						i--;
						test = true;
						break;
					}
					
					word += sen.charAt(i);
				}
				
				for (int j = word.length() - 1; j >= 0; j--) {
					link.addFirst(word.charAt(j));
				}
				if(test)
					continue;
			}
			if(i < sen.length())
				link.addLast(sen.charAt(i));
		}
		
		return link;
	}
	
}
