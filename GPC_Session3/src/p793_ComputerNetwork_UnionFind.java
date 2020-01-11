import java.lang.*;
import java.util.*;
import java.io.*;

public class p793_ComputerNetwork_UnionFind {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numCases = Integer.parseInt(br.readLine());
		br.readLine();
		for (int r = 0; r < numCases; r++) {

			int computerNum = Integer.parseInt(br.readLine());

			UnionFind set = new UnionFind(computerNum);

			String word = br.readLine();
			int correct = 0, incorrect = 0;
			while (!word.isEmpty() && word != null) {
				Scanner kb = new Scanner(word);
				char w = kb.next().charAt(0);
				int c1 = kb.nextInt() - 1, c2 = kb.nextInt() - 1;

				if (w == 'c')
					set.union(c1, c2);
				else if (w == 'q') {
					if (set.find(c1) == set.find(c2))
						correct++;
					else
						incorrect++;
				}
				word = br.readLine();
			}
			System.out.println(correct + "," + incorrect + "\n");
		}
		br.close();
	}
}

class UnionFind {

	int[] parent;
	int[] rank;

	UnionFind(int max) {
		parent = new int[max];
		rank = new int[max];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
	}

	public int find(int index1) {
		int p = parent[index1];
		if (index1 == p)
			return index1;
		parent[index1] = find(p);
		return parent[index1];
	}

	public void union(int index1, int index2) {
		int root1 = find(index1);
		int root2 = find(index2);

		if (root1 == root2)
			return;

		if (rank[root1] > rank[root2]) {
			parent[root2] = root1;
		} else if (rank[root2] > rank[root1]) {
			parent[root1] = root2;
		} else {
			parent[root2] = root1;
			rank[root1]++;
		}

	}
}
