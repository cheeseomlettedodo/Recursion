import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int n = sc.nextInt();
        printName(name, n);
        
        
    }
    
    private static void printName(String s, int n) {
        if(n <= 0) {
            return;
        }
        
        System.out.println(s);
        n--;
        printName(s, n);
    }
}
