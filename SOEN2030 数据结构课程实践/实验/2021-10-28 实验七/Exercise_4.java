public class Exercise_4 {
    // 判断是否n为素数
    public static boolean is_prime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 18, 19, 12, 17, 20, 11, 8, 15, 16, 17 };
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (is_prime(nums[i] + nums[j])) {
                    System.out.println("(" + nums[i] + ", " + nums[j] + ")");
                }
            }
        }
    }
}
