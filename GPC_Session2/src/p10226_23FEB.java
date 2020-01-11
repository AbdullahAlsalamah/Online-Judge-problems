import java.util.*;
import java.io.*;

public class p10226_23FEB {
	public static void main(String[] args) throws Exception{
		Scanner kb = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int numCase = Integer.parseInt(br.readLine());//kb.nextInt();
//		kb.nextLine();
//		kb.nextLine();
		br.readLine();
		//br.readLine();
		for (int i = 0; i < numCase; i++) {
		
			TreeMap<String, Integer> trees = new TreeMap<String, Integer>();
			String tree;
			int treeNum = 0;
			do {
				tree = br.readLine();//kb.nextLine();
				if(!tree.isEmpty()) {
					treeNum++;
					if(trees.containsKey(tree)) {
						trees.put(tree, trees.get(tree) + 1);
					} else
						trees.put(tree, 1);
				}
			} while (!tree.isEmpty());

			
			for(Map.Entry<String, Integer> entry : trees.entrySet()) {
				System.out.printf("%s %.4f\n", entry.getKey(), (entry.getValue() / (double)treeNum)*100);
			}
			System.out.println();
		}
		
		
		kb.close();
		br.close();
	}
}
