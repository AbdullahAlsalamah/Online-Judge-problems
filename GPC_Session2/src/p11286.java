import java.util.*;

public class p11286 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int froshNum = kb.nextInt();

		while (froshNum != 0) {
			int[][] courses = new int[froshNum][5];
			int winners = 0;
			for (int i = 0; i < courses.length; i++) {
				for (int j = 0; j < courses[i].length; j++) {
					courses[i][j] = kb.nextInt();
				}
			}
			
			System.out.println(Winner(courses));
			froshNum = kb.nextInt();
		}

		kb.close();
	}

	public static int Winner(int[][] arr) {
		int winners = 0;
		int currentPoint = 1;
		int points = 0;
		LinkedList<Integer> list = new LinkedList<Integer>();
		for (int i = 0; i < arr.length-1; i++) {
			for (int k = i+1; k < arr.length-1; k++) {
				points = 0;
				for (int j = 0; j < 5; j++) {
					for (int j2 = 0; j2 < 5; j2++) {
						if(arr[i][j] == arr[k][j2])
							points++;
					}
				}
				if(points > currentPoint) {
					currentPoint = points;
					winners = 2;
					list.removeAll(list);
					list.add(i);
					list.add(k);
				} else if(points == currentPoint) {
					if(!list.contains(k)) {
						list.add(k);
						winners++;
					}
				}
			}
		}
		
		if(winners == 0)
			return arr.length;
		else
			return winners;
	}
}
