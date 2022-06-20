public class Exercise_2 {
    public static void main(String[] args) {
        double half_of_pi = 1;
        double n = 0;
        for (int i = 0; i < 100; i++) {
            n = Math.sqrt(2 + n);
            half_of_pi *= 2 / n;
        }
        double pi = 2 * half_of_pi;
        System.out.println(pi);
    }
}