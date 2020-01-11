import java.util.Scanner;

public class p12149 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int N = kb.nextInt();
        while(N != 0){
            
            
            System.out.println((int)Math.round((1/6.0)* N * (N+1)*(2*N+1)));
            
            
            N = kb.nextInt();
        }
        
        
        kb.close();
    }
    
}