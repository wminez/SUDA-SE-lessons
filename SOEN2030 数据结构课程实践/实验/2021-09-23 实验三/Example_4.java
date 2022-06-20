public class Example_4 {
    public static void main(String[] args) {
        int count;
        long beginTime = System.nanoTime();
        for (count = 1; count <= 1000; count++) {
            int[] c = new int[10];
            for (int a = 0; a < 10; a++) {
                c[a] = a * a * a;
            }
            int n = 99;
            for (int i = 1; i <= 9; i++) {
                int ic = c[i];
                for (int j = 0; j <= 9; j++) {
                    int jc = c[j];
                    for (int k = 0; k <= 9; k++) {
                        n++;
                        if (ic + jc + c[k] == n) {
                            System.out.println(n);
                        }
                    }
                }
            }
        }
        long endTime = System.nanoTime();
        long costTime = (endTime - beginTime) / 1000 / count;
        System.out.println("平均用时" + costTime + "微秒");
    }
}