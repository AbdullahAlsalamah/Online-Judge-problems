import java.util.*;

public class p00156 {
	
	static LinkedList<String> dic = new LinkedList<String>();
	static LinkedList<String> res = new LinkedList<String>();
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String str = kb.next();
		while(!str.equals("#")) {
			ch(str);
			str = kb.next();
		}
		
		
		res.sort(null);
		for (int i = 0; i < res.size(); i++) {
			System.out.println(res.get(i));
		}
	}
	
	static void ch(String str) {
		
		for (int i = 0; i < dic.size(); i++) {
			if(dic.get(i).length() == str.length()) {
				if(ss(dic.get(i), str)) {
					res.remove(dic.get(i));
					dic.add(str);
					return;
				}
			}
		}
		dic.add(str);	
		res.push(str);
	}
	
	static boolean ss(String str1, String str2) {
		int count = 0;
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		for (int i = 0; i < str1.length(); i++) {
			if(count != i)
				return false;
			for (int j = 0; j < str2.length(); j++) {
				if(str1.charAt(i) == str2.charAt(j)) {
					count++;
					if(j+1 == str2.length())
						str2 = str2.substring(0, j);
					else
						str2 = str2.substring(0, j) + str2.substring(j+1);
					break;
				}
			}
		}
		if(count == str1.length())
			return true;
		else
			return false;
	}
}






