import java.util.Arrays;

public class Exercise_5 {
    // 判断n是否为素数
    public static boolean is_prime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int count = 0;
        int n = 1;
        int[] nums = new int[10];
        while (count < 10) {
            n += 1;
            if (is_prime(n)) {
                count = 0;
            } else {
                nums[count] = n;
                count += 1;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
