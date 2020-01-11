import java.util.*;

public class p11565 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int numCase = kb.nextInt();

		for (int i = 0; i < numCase; i++) {
			int A, B, C;
			int x = -69, y = -1, z = 71;
			A = kb.nextInt();
			B = kb.nextInt();
			C = kb.nextInt();
			boolean inc = false, sol = false;
			while (x < 22) {
				if (valueA(x, y, z) == A && valueB(x, y, z) == B && valueC(x, y, z) == C && x != y && x != z && y != z) {
					sol = true;
					break;
				}

				if (x <= 0 || y <= 0) {
					if(x == 0 && y == 0) {
						x = 1;
						y = 1;
						z = 1;
						continue;
					} else if( y == 0) {
						x++;
						y = x;
						z = 1;
						continue;
					}
					
					if(valueA(x, y, z) <= 0) {
						z++;
						continue;
					}
					
					if(valueB(x, y, z) > 10000 || valueC(x, y, z) > 10000) {
						y++;
						z = 1;
						continue;
					}
				} else {
					if (inc && (valueB(x, y, z) > 10000 || valueC(x, y, z) > 10000)) {
						x++;
						y = x;
						z = x;
						continue;
					}

					if (valueB(x, y, z) > 10000 || valueC(x, y, z) > 10000) {
						y++;
						z = y;
						inc = true;
						continue;
					}
					inc = false;
				}
				z++;
			}
			if (sol)
				System.out.println(x + " " + y + " " + z);
			else
				System.out.println("No solution.");

		}

		kb.close();
	}

	public static int valueA(int x, int y, int z) {
		return x + y + z;
	}

	public static int valueB(int x, int y, int z) {
		return x * y * z;
	}

	public static int valueC(int x, int y, int z) {
		return (int) (Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));
	}
}
