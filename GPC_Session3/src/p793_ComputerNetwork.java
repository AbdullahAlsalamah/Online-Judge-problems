import java.util.*;
import java.io.*;

public class p793_ComputerNetwork {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int numCases = Integer.parseInt(br.readLine());
		br.readLine();
		for (int r = 0; r < numCases; r++) {

			int computerNum = Integer.parseInt(br.readLine());

			int[][] network = new int[computerNum][computerNum];
			for (int i = 0; i < network.length; i++) {
				for (int j = 0; j < network.length; j++) {
					if (i == j)
						network[i][j] = 1;
					else
						network[i][j] = 0;
				}
			}

			String word = br.readLine();
			int correct = 0, incorrect = 0;
			while (!word.isEmpty() && word != null && word != "") {
				Scanner kb = new Scanner(word);
				char w = kb.next().charAt(0);
				int c1 = kb.nextInt() - 1, c2 = kb.nextInt() - 1;

				if (w == 'c')
					connect(network, c1, c2);
				else if (w == 'q') {
					if (checkConnection(network, c1, c2))
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

	public static void connect(int[][] arr, int index1, int index2) {
		arr[index1][index2] = 1;
		arr[index2][index1] = 1;
	}

	public static boolean checkConnection(int[][] arr, int index1, int index2) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[index1][i] == 1 && arr[index2][i] == 1)
				return true;
		}
		return false;
	}
}
