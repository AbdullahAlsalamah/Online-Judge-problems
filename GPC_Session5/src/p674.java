import java.util.*;
import java.io.*;

public class p674 {
	public static void main(String[] args) throws Exception {
		//Scanner kb = new Scanner(new FileInputStream("input.txt"));
		int cents = 39;
		int ways = 0;
		if(cents < 5) {
			ways = 1;
		} else if(cents < 10) {
			ways = change5(cents) + 1;
		} else if(cents < 25) {
			ways = change10(cents) + 1;
		} else if(cents < 50) {
			ways = change25(cents) + 1;
		} else {
			ways = change50(cents) + 1;
		}
		System.out.println(ways);
		System.out.println(changeWays(39));
	}

	public static int count(int x) {
		int sum = 0;
		if (x <= 0) {
			return 1;
		}
		if (x >= 50)
			sum += count(x - 50);
		if(x >= 25)
			sum += count(x-25);
		if (x >= 10)
			sum += count(x - 10);
		if(x >= 5)
			sum += count(x-5);
		if(x >= 1)
			sum += count(x-1);
		
		return sum;
	}
	
	
	public static int changeWays(int cents) {
		int count = 0;
		for (int i = 0; i <= cents/50; i++) {
			for (int j = 0; j <= cents/25; j++) {
				for (int j2 = 0; j2 <= cents/10; j2++) {
					for (int k = 0; k <= cents/5; k++) {
						for (int k2 = 0; k2 <= cents; k2++) {
							if((50*i + 25*j + 10*j2 + 5*k + k2) == cents)
								count++;
						}
					}
				}
			}
		}
		return count;
	}
	
	public static int change5(int cents) {
		return cents/5;
	}
	
	public static int change10(int cents) {
		int change = change5(cents) + 1;
		for (int i = 10; i <= cents; i += 10) {
			change += change5(cents - i);
		}
		return change;
	}
	
	public static int change25(int cents) {
		int change = change10(cents) + 1;
		for (int i = 25; i <= cents ; i+= 25) {
			change += change10(cents - i);
		}
		return change;
	}
	
	public static int change50(int cents) {
		int change = change25(cents) + 1;
		for (int i = 50; i <= cents ; i+= 50) {
			change += change25(cents - i);
		}
		return change;
	}
	
	/*public static int change(int cents) {
		int m = 1;
		for (int i = 0; i <= cents; i += 50) {
			for (int j = 0; j <= cents; j += 25) {
				for (int j2 = 0; j2 <= cents; j2 += 10) {
					
				}
			}
		}
	}*/
}
