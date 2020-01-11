import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class p10226Irfan {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		TreeMap<String, Integer> map; 
		int count = 0;
		int totalCount = 0;
		int noTestCases = Integer.parseInt(br.readLine());
		int currentTestCase = 1;
		//System.out.println(noTestCases);
		br.readLine(); // skip first new line
		while(currentTestCase<=noTestCases) {
			map = new TreeMap<String, Integer>();
			String key = br.readLine();
			while(key != null && !key.isEmpty()) {
				//System.out.println(key);
				if(map.containsKey(key)) {
					//System.out.println("Contains: " + key);
					count = map.get(key) + 1;
					map.put(key, count);	
					totalCount++;
				} else {
					map.put(key, 1);
					totalCount++;
				}				
				key = br.readLine();
			}//end while
			//System.out.println("Total Count: " + totalCount);
			for(Map.Entry<String,Integer> entry : map.entrySet()) {
				String str = entry.getKey();
				int val = entry.getValue();
				System.out.printf("%s %.4f\n", str, ((val*100.0)/totalCount));
			}
			//System.out.println("End Test Case " + currentTestCase);
			if(currentTestCase!=noTestCases)
				System.out.println();
			currentTestCase++;
			totalCount = 0;
		}
		
		br.close();
	}//end main

}
