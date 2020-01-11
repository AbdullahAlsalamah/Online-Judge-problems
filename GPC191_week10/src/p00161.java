import java.util.*;

public class p00161 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int count = 0;
		
		while(count != 3) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			int time = kb.nextInt();
			int numTraffic = 0;
			int minTime = Integer.MAX_VALUE;
			//int minIdx = 0;
			if(time == 0) {
				count++;
			} else {
				count = 0;
				while(time != 0) {
					list.add(time);
					numTraffic++;
					if(time < minTime) {
						minTime = time;
						//minIdx = numTraffic - 1;
					}
					time = kb.nextInt();
				}
				int[] stat = new int[numTraffic];
				Arrays.fill(stat, 0);
				for (int i = 0; i < stat.length; i++) {
					if(list.get(i) == minTime)
						stat[i] = 1;
				}
				//stat[minIdx] = 1;
				System.out.println(ss(list, stat, minTime));
			}
		}
		
		
		kb.close();
	}
	
	static String ss(LinkedList<Integer> list, int[] stat, int min) {
		int[] timeNow = new int[stat.length];

		Arrays.fill(timeNow, min-4);
		
		for (int t = min-5; t <= 18000; t++) {
			
			if(checkAll(stat)) {
				//t--;
				int h = t / 3600;
				t = t%3600;
				int m = t / 60;
				t = t%60;
				int s = t;
				return String.format("%02d:%02d:%02d", h, m, s);
			}
			
			for (int i = 0; i < timeNow.length; i++) {
				
				if(timeNow[i] == list.get(i) && stat[i] == 2) {
					timeNow[i] = 1;
					stat[i] = 0;
				} else if(timeNow[i] == list.get(i) - 5 && stat[i] == 0) {
					timeNow[i]++;
					stat[i] = 1;
				} else if(timeNow[i] == list.get(i) && stat[i] == 1) {
					timeNow[i] = 1;
					stat[i] = 2;
				} else {
					timeNow[i]++;
				}
			}
		}
		
		return "Signals fail to synchronise in 5 hours";
	}
	
	public static boolean checkAll(int[] boo) {
		for (int i = 0; i < boo.length; i++) {
			if(boo[i] != 0)
				return false;
		}
		return true;
	}
	
}

