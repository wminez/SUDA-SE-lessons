import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) throws Exception{
        List<Integer> lst = new List<Integer>();
        Scanner in = new Scanner(System.in);
        System.out.println("是否对单链表进行插入或删除? (Y/N)");
        boolean yesOrNo = in.nextLine().equals("Y");
        while (yesOrNo) {
            System.out.println("进行插入还是删除? (1--插入, 2--删除)");
            if (in.nextLine().equals("1")) {
                System.out.println("输入插入位置:");
                int index = Integer.parseInt(in.nextLine());
                System.out.println("输入插入元素:");
                int x = Integer.parseInt(in.nextLine());
                try {
                    lst.insert(index, (Integer) x);
                    System.out.println("当前链表为: " + lst);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("输入删除位置:");
                int index = Integer.parseInt(in.nextLine());
                try {
                    lst.remove(index);
                    System.out.println("当前链表为: " + lst);
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            System.out.println("是否对单链表进行插入或删除? (Y/N)");
            yesOrNo = in.nextLine().equals("Y");
        }
        in.close();
        System.out.println("单链表处理完毕");
    }
}