// Trailing zeroes in factorial number.
// Input: n = 5
// Output: 1 
// Factorial of 5 is 120 which has one trailing 0.

// Input: n = 20
// Output: 4
// Factorial of 20 is 2432902008176640000 which has
// 4 trailing zeroes.

// Input: n = 100
// Output: 24

import java.util.*;

public class TrailingZeroes {
    public static int trailingZeroes(int n) {
        int result = 0;
        for(int i = 5; i <= n; i = i * 5) {
            result += n/i; 
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = trailingZeroes(n);
        System.out.println(result);
        sc.close();
    }
}