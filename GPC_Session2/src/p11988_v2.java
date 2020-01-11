import java.util.*;
public class p11988_v2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		String word;
		do {
			word = kb.nextLine();
			LinkedList<String> link = new LinkedList<String>();
			
			int index = 0;
			int home, end;
			home = word.indexOf('[', index);
			end = word.indexOf(']', index);
			if(home == -1 && end == -1)
				link.add(word);
			else {
				do {
					System.out.println("home = " + home + " end = " + end + " index = " + index );
					if(home != -1 && home < end) {
						link.addFirst(word.substring(index, home));
						index = home + 1;
						if(index == word.length())
							break;
						home = word.indexOf('[', index);
					} else if(end != -1) {
						link.add(word.substring(index, end));
						index = end + 1;
						if(index == word.length())
							break;
						end = word.indexOf(']', index);
					}
				} while( home != -1 || end != -1);
			}
			
			for (int i = 0; i < link.size(); i++) {
				System.out.println(link.get(i));
			}
		} while (!word.isEmpty());
		
		kb.close();
	}
}


//int home = word.indexOf('['), end= word.indexOf(']');
//boolean homeCheck = false, endCheck = false;
//int index = 0;
//if(home != - 1  && home < end) {
//	link.add(word.substring(index, home));
//	System.out.println(home < word.length() - 1);
//	if(home < word.length() - 1) {
//		index = home + 1;
//		home = word.indexOf('[', home + 1);
//	} else
//		home = -1;
//} else if(end != -1) {
//	link.add(word.substring(index, end));
//	if(end < word.length() - 1) {
//		index = end + 1;
//		end = word.indexOf(']', end + 1);
//	} else
//		end = -1;
//} else
//	link.add(word);
//
//while(home != -1 || end != -1) {
//	System.out.println("Index = " + index + " home = " + home);
//	if(home != - 1  && home < end) {
//		link.addFirst(word.substring(index, home));
//		if(home < word.length() - 1) {
//			index = home + 1;
//			home = word.indexOf('[', home + 1);
//		} else
//			home = -1;
//	} else if(end != -1) {
//		link.add(word.substring(index, end));
//		if(end < word.length() - 1) {
//			index = end + 1;
//			end = word.indexOf(']', end + 1);
//		} else
//			end = -1;
//	}
//}
////	System.out.println("BBB");
