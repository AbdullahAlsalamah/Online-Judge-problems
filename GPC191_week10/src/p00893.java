import java.util.*;
public class p00893 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int numDays = kb.nextInt();
		int d = kb.nextInt();
		int m = kb.nextInt();
		int y = kb.nextInt();
		
		while(numDays != 0 || d != 0 || m != 0 || y != 0) {
			
			
			y = y + (numDays / 1461) * 4;
			//System.out.println("years = "+y);
			numDays = numDays % 1461;
			//System.out.println(numDays);
//			while(numDays > 366) {
//			
//				if(isLeap(y) && m <= 2 && numDays >= 366) {
//					if(m == 1) {
//						numDays -= 366;
//						y++;
//					} else if(m == 2 && d <= 28) {
//						numDays -= 366;
//						y++;
//					}
//				} else if(isLeap(y+1) && m > 2 && numDays >= 365) {
//					numDays -= 366;
//					y++;
//				} else if(numDays >= 365) {
//					numDays -= 365;
//					y++;
//				}
//			}
			
			//if(numDays <= 366) {
				System.out.println(res(y, m, d, numDays));
			//} else 
			//	System.out.println(numDays);
		
			
			//Calendar cal = Calendar.getInstance();
			//cal.set(y, m-1, d);
			//cal.add(Calendar.DAY_OF_YEAR, numDays);
			
			//System.out.printf("%d %d %d\n", cal.get(Calendar.DATE), cal.get(Calendar.MONTH)+1, cal.get(Calendar.YEAR));
			numDays = kb.nextInt();
			d = kb.nextInt();
			m = kb.nextInt();
			y = kb.nextInt();
		}
		
		kb.close();
	}
	
	public static boolean isLeap(int y) {
		if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
			return true;
		else 
			return false;
	}
	
	public static String res(int y, int m, int d, int n) {
		
		for (int i = n; i != 0 ; i--) {
			if((m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) && d == 31) {
				d = 1;
				if(m == 12) {
					m = 1;
					y++;
				} else
					m++;
				continue;
			} else if(m == 2 && d == 29) {
				d = 1;
				m++;
				continue;
			} else if(!isLeap(y) && m == 2 && d == 28) {
				d = 1;
				m++;
				continue;
			} else if((m == 4 || m == 6 || m == 9 || m == 11) && d == 30) {
				d = 1;
				m++;
				continue;
			}
			d++;
			
		}
		
		
		return String.format("%d %d %d", d, m, y);
	}
	
}
