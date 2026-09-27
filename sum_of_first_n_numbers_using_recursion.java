import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.println(sum_of_n(n, sum));
        
    }
    
    private static int sum_of_n(int n, int sum) {
        if(n <= 0) {
            return sum;
        }
        
        sum += n;
        n--;
        return sum_of_n(n, sum);
    }
}
