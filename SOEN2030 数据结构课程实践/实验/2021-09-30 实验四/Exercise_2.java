import java.util.Arrays;
import java.util.HashSet;

public class Exercise_2 {
    public static void main(String[] args) {
        for (int i = 47; i < 100; i++) {
            String[] a = String.valueOf(i * i).split("");
            String[] b = String.valueOf(i * i * i).split("");
            String[] c = new String[10];
            for (int j = 0; j < 4; j++) {
                c[j] = a[j];
            }
            for (int j = 4; j < 10; j++) {
                c[j] = b[j - 4];
            }
            HashSet<String> s = new HashSet<String>(Arrays.asList(c));
            if (s.size() >= 10) {
                System.out.println(i);
                break;
            }
        }
    }
}