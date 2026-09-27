import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prod = 1;
        System.out.println(fact(n, prod));
        
    }
    
    private static int fact(int n, int prod) {
        if(n < 0) {
            return -1; // Factorial doesn't exist for negative numbers
        }
        
        if(n == 0) {
            return prod;
        }
        
        prod *= n;
        n--;
        return fact(n, prod);
    }
}
