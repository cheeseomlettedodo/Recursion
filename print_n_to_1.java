import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        printNto1(n, i);
        
    }
    
    private static void printNto1(int n, int i) {
        if(n < i) {
            return;
        }
        
        System.out.println(n);
        n--;
        printNto1(n, i);
    }
}
