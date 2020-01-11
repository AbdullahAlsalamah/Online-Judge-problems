import java.util.*;
public class p00382 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int N = kb.nextInt();
        System.out.println("PERFECTION OUTPUT");
        while(N != 0){
            
            int ss = nn(N);
            System.out.printf("%5d  ", N);
            if(ss == N){
                System.out.println("PERFECT");
            } else if (ss < N){
                System.out.println("DEFICIENT");
            } else{
                System.out.println("ABUNDANT");
            }
            
            
            N = kb.nextInt();
        }
        System.out.println("END OF OUTPUT");
        
        kb.close();
    }
    
    public static int nn(int N){
        int sum = 0;
        
        for (int i = 1; i <= N/2; i++) {
            
            if(N%i == 0){
                //System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
