import java.util.*;

public class p441_Lotto {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		int inputNum = kb.nextInt();

		while (inputNum != 0) {
			int[] index = { 0, 1, 2, 3, 4, 5 };
			int[] arr = new int[inputNum];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = kb.nextInt();
			}

			while (index[0] <= arr.length - 6) {
				System.out.println(arr[index[0]] + " " + arr[index[1]] + " " + arr[index[2]] + " " + arr[index[3]] + " "
						+ arr[index[4]] + " " + arr[index[5]]);

				index[5]++;

				if (index[5] == arr.length && index[4] != arr.length - 1) {
					index[4]++;
					index[5] = index[4] + 1;
				}
				if (index[4] == arr.length - 1 && index[3] != arr.length - 2) {
					index[3]++;
					index[4] = index[3] + 1;
					index[5] = index[4] + 1;
				}
				if (index[3] == arr.length - 2 && index[2] != arr.length - 3) {
					index[2]++;
					index[3] = index[2] + 1;
					index[4] = index[3] + 1;
					index[5] = index[4] + 1;
				}
				if (index[2] == arr.length - 3 && index[1] != arr.length - 4) {
					index[1]++;
					index[2] = index[1] + 1;
					index[3] = index[2] + 1;
					index[4] = index[3] + 1;
					index[5] = index[4] + 1;
				}
				if (index[1] == arr.length - 4 && index[0] != arr.length - 5) {
					index[0]++;
					index[1] = index[0] + 1;
					index[2] = index[1] + 1;
					index[3] = index[2] + 1;
					index[4] = index[3] + 1;
					index[5] = index[4] + 1;
				}

			}
			

			inputNum = kb.nextInt();
			if(inputNum != 0)
				System.out.println();
		}
		kb.close();
	}

}
