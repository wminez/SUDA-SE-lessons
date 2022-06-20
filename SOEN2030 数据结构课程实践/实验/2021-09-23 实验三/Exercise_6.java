import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        // Number Lists
        // Given P integers 1, 2, 3, …, P, you can construct a list
        // which contains L integers chosen from the P integers, 
        // but the list can not have K or more than K consecutive 1’s.
        // (1 ≤ P < 10, 1 < L < 31, 1 < K < L + 1)
        // For example, when P = 2, L = 3, and K = 2, the lists can be:
        // 121
        // 122
        // 212
        // 221
        // 222
        // There are 5 lists.
        // In the case of P = 3, L = 3, and K = 3, the lists can be:
        // 112 211 311
        // 113 212 312
        // 121 213 313
        // 122 221 321
        // 123 222 322
        // 131 223 323
        // 132 231 331
        // 133 232 332
        //     233 333
        // There are 26 lists.
        // Given three integers P, L, and K, you are required to 
        // calculate the total number of allowable lists as described above.
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int L = sc.nextInt();
        int K = sc.nextInt();
        sc.close();
        int result = 0;
        result = (int) (Math.pow(P, L - K + 1) - Math.pow(P - 1, L - K + 1));
        result = (int) (Math.pow(P, L) - result);
        System.out.println(result);
    }
}
