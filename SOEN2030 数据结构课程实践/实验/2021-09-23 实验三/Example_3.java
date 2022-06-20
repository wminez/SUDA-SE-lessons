public class Example_3 {
    public static void main(String[] args) {
        int n = 99;
        int count;
        long beginTime = System.nanoTime();
        for (count = 1; count <= 1000; count++) {
            for (int i = 1; i <= 9; i++) {
                int ic = i * i * i;
                for (int j = 0; j <= 9; j++) {
                    int jc = j * j * j;
                    for (int k = 0; k <= 9; k++) {
                        n++;
                        if (ic + jc + k * k * k == n) {
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