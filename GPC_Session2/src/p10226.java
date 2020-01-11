import java.util.*;

public class p10226 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int numCase = kb.nextInt();
		kb.nextLine();
		kb.nextLine();
		
		ArrayList<String> finalres = new ArrayList<String>();
		for (int i = 0; i < numCase; i++) {
			//ArrayList<String> res = new ArrayList<String>();
			
			String tree;
			LinkedList<String> trees = new LinkedList<String>();
			int count = 0;
			do {
				tree = kb.nextLine();
				if(!tree.isEmpty()) {
					trees.add(tree);
					count++;
				}	
			} while (!tree.isEmpty());
			
			ArrayList<TREE> t = new ArrayList<TREE>();
			for (int j = 0; j < trees.size(); j++) {
				boolean found = false;
				for (int j2 = 0; j2 < t.size(); j2++) {
					if(trees.get(j).equals(t.get(j2).name)) {
						t.get(j2).number++;
						found = true;
						break;
					}
				}
				if(!found) {
					t.add(new TREE(trees.get(j)));
				}
			}
			String[] res = new String[t.size()];
			for (int j = 0; j < t.size(); j++) {
				res[j] = (String.format("%s %.4f",t.get(j).name, ((double)t.get(j).number / count) * 100.0));
			}
			Arrays.sort(res);
			for (int j = 0; j < res.length; j++) {
				finalres.add(res[j]);
			}
			finalres.add("");
			
		}
		
		for (int i = 0; i < finalres.size(); i++) {
			System.out.println(finalres.get(i));
		}
		
		kb.close();
	}
}


class TREE implements Comparable{
	String name;
	int number = 0;
	
	TREE(String name){
		this.name = name;
		number = 1;
	}

	@Override
	public int compareTo(Object t) {
		String s = ((TREE)t).name;
		return this.name.compareTo(s);
	}
	
}
