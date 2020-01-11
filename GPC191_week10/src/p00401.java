import java.io.*;
import java.util.*;


class p00401 {
	public static void main(String[] args)throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner kb = new Scanner(new FileInputStream("text.txt"));
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('A', 'A');
		map.put('E', '3');
		map.put('H', 'H');
		map.put('I', 'I');
		map.put('J', 'L');
		map.put('L', 'J');
		map.put('M', 'M');
		map.put('O', 'O');
		map.put('S', '2');
		map.put('T', 'T');
		map.put('U', 'U');
		map.put('V', 'V');
		map.put('W', 'W');
		map.put('X', 'X');
		map.put('Y', 'Y');
		map.put('Z', '5');
		map.put('1', '1');
		map.put('2', 'S');
		map.put('3', 'E');
		map.put('5', 'Z');
		map.put('8', '8');
		
		//String str = br.readLine();
		
		
		while(kb.hasNext()) {
			String str = kb.nextLine();
			
			boolean pal = palindromes(str);
			boolean mir = mirror(str, map);
			
			if(pal && mir)
				System.out.println(str + " -- is a mirrored palindrome.");
			else if(mir)
				System.out.println(str + " -- is a mirrored string.");
			else if(pal)
				System.out.println(str + " -- is a regular palindrome.");
			else 
				System.out.println(str + " -- is not a palindrome.");
			
			System.out.println();
			
			
			//str = br.readLine();
			
		}
		
		
		//br.close();
		kb.close();
		System.exit(0);
	}
	
	
	 static boolean palindromes(String str) {
		for (int i = 0, j = str.length() - 1; i < str.length()/2; i++, j--) {
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
	}
	
	 static boolean mirror(String str, HashMap<Character, Character> map) {
		for (int i = 0, j = str.length() - 1; i <= str.length()/2; i++, j--) {
			
			if(map.get(str.charAt(i)) == null || map.get(str.charAt(i)) != (str.charAt(j)))
				return false;
		}
		
		return true;
	}
}
