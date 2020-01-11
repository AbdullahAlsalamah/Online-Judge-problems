import java.util.*;
public class p10114 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int months = kb.nextInt();
		double downpay = kb.nextDouble();
		double loan = kb.nextDouble();
		int dep = kb.nextInt();
		
		while( months >= 0) {
			double carValue = loan + downpay;
			double sss = loan/months;
			//int mm = kb.nextInt();
			int[] ms = new int[dep];
			double[] ds = new double[dep];
			
			for (int i = 0; i < dep; i++) {
				ms[i] = kb.nextInt();
				ds[i] = kb.nextDouble();
			}
			
			int mm = ms[0];
			double dd = ds[0];
			int mk = 1;
			boolean dsd = false;
			boolean end = true;
			
			
			for (int i = 0; i < months; i++) {
				
				if(!dsd & mm == i)
					dsd = true;
				
				if(mk < dep) {
					if(ms[mk] == i) {
						mm = ms[mk];
						dd = ds[mk];
						mk++;
					}
				}
				
				
				if(dsd)
					carValue -= carValue*dd;
				
				if(carValue > loan) {
					if(i == 1)
						System.out.println("1 month");
					else
						System.out.println(i + " months");
					end = false;
					break;
				}
				loan -= sss;
			}
			if(end)
				System.out.println(months + " months");
	
			months = kb.nextInt();
			downpay = kb.nextDouble();
			loan = kb.nextDouble();
			dep = kb.nextInt();
		}
		
		
		
		kb.close();
	}
}
