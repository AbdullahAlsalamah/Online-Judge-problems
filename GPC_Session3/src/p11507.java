import java.util.*;

public class p11507 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int L = kb.nextInt();

		while (L != 0) {
			String currentPosition = "+x";
			for (int i = 0; i < L - 1; i++) {
				String bend = kb.next();
				if(!bend.equals("No"))
					currentPosition = checkPosition(currentPosition, bend);
			}
			
			System.out.println(currentPosition);
			L = kb.nextInt();
		}

		kb.close();
	}
	
	public static String checkPosition(String currentPosition, String bend) {
		if (currentPosition.equals("+x")) {
			if (bend.equals("+y")) {
				return "+y";
			} else if (bend.equals("-y")) {
				return "-y";
			} else if (bend.equals("+z")) {
				return "+z";
			} else if (bend.equals("-z")) {
				return "-z";
			}
		} else if (currentPosition.equals("-x")) {
			if (bend.equals("+y")) {
				return "-y";
			} else if (bend.equals("-y")) {
				return "+y";
			} else if (bend.equals("+z")) {
				return "-z";
			} else if (bend.equals("-z")) {
				return "+z";
			}
		} else if (currentPosition.equals("+y")) {
			if (bend.equals("+y")) {
				return "-x";
			} else if (bend.equals("-y")) {
				return "+x";
			} else if (bend.equals("+z")) {
				return "+y";
			} else if (bend.equals("-z")) {
				return "+y";
			}
		} else if (currentPosition.equals("-y")) {
			if (bend.equals("+y")) {
				return "+x";
			} else if (bend.equals("-y")) {
				return "-x";
			} else if (bend.equals("+z")) {
				return "-y";
			} else if (bend.equals("-z")) {
				return "-y";
			}
		} else if (currentPosition.equals("+z")) {
			if (bend.equals("+y")) {
				return "+z";
			} else if (bend.equals("-y")) {
				return "+z";
			} else if (bend.equals("+z")) {
				return "-x";
			} else if (bend.equals("-z")) {
				return "+x";
			}
		} else if (currentPosition.equals("-z")) {
			if (bend.equals("+y")) {
				return "-z";
			} else if (bend.equals("-y")) {
				return "-z";
			} else if (bend.equals("+z")) {
				return "+x";
			} else if (bend.equals("-z")) {
				return "-x";
			}
		}
		return "";
	}
}
