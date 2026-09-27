import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        print1ToN(n, i);
        
    }
    
    private static void print1ToN(int n, int i) {
        if(i > n) {
            return;
        }
        
        System.out.println(i);
        i++;
        print1ToN(n, i);
    }
}
