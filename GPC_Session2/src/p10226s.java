import java.util.*;

public class p10226s {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numCase = kb.nextInt();
		kb.nextLine();
		kb.nextLine();

		for (int i = 0; i < numCase; i++) {

			String tree;
			LinkedList<TREE> trees = new LinkedList<TREE>();
			int count = 0;
			do {
				tree = kb.nextLine();
				if (!tree.isEmpty()) {
					count++;
					if (!treeSearch(tree, trees)) {
						if (trees.size() == 0) {
							trees.add(new TREE(tree));
						} else {
							for (int j = 0; j < trees.size(); j++) {
								if (tree.compareTo(trees.get(j).name) < 0) {
									trees.add(j, new TREE(tree));
									break;
								}
							}
						}
					}
				}
			} while (!tree.isEmpty());
			/*
			 * for (int j = 0; j < trees.size(); j++) {
			 * System.out.println(trees.get(j).name);
			 * 
			 * }
			 */
			// Collections.sort(trees);

			for (int j = 0; j < trees.size(); j++) {
				System.out.printf("%s %.4f\n", trees.get(j).name, ((double) trees.get(j).number / count) * 100);
			}
		}
		kb.close();
	}

	public static boolean treeSearch(String tree, LinkedList<TREE> t) {
		for (int i = 0; i < t.size(); i++) {
			if (tree.equals(t.get(i).name)) {
				t.get(i).number++;
				return true;
			}
		}
		return false;
	}
}

/*
 * class TREE implements Comparable{ String name; int number = 0;
 * 
 * TREE(String name){ this.name = name; number = 1; }
 * 
 * @Override public int compareTo(Object t) { String s = ((TREE)t).name; return
 * this.name.compareTo(s); }
 * 
 * }
 */
