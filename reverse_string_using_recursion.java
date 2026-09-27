// Strings in Java are immutable, hence, we convert the String into a char array and then do the usual reversal the way you'd do for a normal array.

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char arr[] = new char[s.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = s.charAt(i);
        }
        
        int left = 0;
        int right = s.length() - 1;
        rev(arr, left, right);
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        
    }
    
    private static void rev(char [] arr, int left, int right) {
        if(left > right) {
            return;
        }
        
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        
        left++;
        right--;
        
        rev(arr, left, right);
        
        
    }
}
