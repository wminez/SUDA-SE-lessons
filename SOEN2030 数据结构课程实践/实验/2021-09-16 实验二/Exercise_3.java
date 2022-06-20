public class Exercise_3 {
    public static void main(String[] args) {
        double half_of_pi = 1;
        double n = 1;
        for (int i = 1; i < 100; i++) {
            n *= i / (double)(2 * i + 1);
            half_of_pi += n;
        }
        double pi = 2 * half_of_pi;
        System.out.println(pi);
    }
}