import java.util.*;

public class p793 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int numCase = kb.nextInt();
		kb.nextLine();
		for (int i = 0; i < numCase; i++) {
			int numComputer = kb.nextInt();
			//System.out.println(numComputer);
			int[][] arr = new int[numComputer][numComputer];
			//arr[4][4] = 0;
			for (int j = 0; j < arr.length; j++) {
				arr[j][j] = 1;
			}
			String word;
			char c;
			int right = 0, wrong = 0;
			kb.nextLine();
			do {
				word = kb.nextLine();
				if(word.isEmpty())
					break;
				String[] arrs = word.split(" ");
				c = arrs[0].charAt(0);
				//System.out.println("cccc: " + c);
				if(c == 'c') {
					int row = Integer.parseInt(arrs[1]) - 1;//kb.nextInt() - 1;
					int cul = Integer.parseInt(arrs[2]) - 1;//kb.nextInt()- 1;
					
					arr[row][cul] = 1;
					arr[cul][row] = 1;
				} else if(c == 'q') {
					int row = Integer.parseInt(arrs[1]) - 1;//kb.nextInt() - 1;
					int cul = Integer.parseInt(arrs[2])- 1;//kb.nextInt() - 1;
					if(search(arr, row, cul))
						right++;
					else
						wrong++;
				}
			} while (true);
			System.out.println(right + "," + wrong);
			System.out.println();
		}
		
		kb.close();
	}
	
	
	public static boolean search(int[][] arr, int row, int cul) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[row][i] == 1 && arr[cul][i] == 1) {
				return true;
			}
		}
		return false;
	}
}
