import java.util.Scanner;

public class LinkList {
    private Node head;
    private int length;

    public LinkList() {
        length = 0;
        head = new Node();
    }

    public LinkList(int n, boolean order) throws Exception {
        this();
        if (order) {
            create1(n);
        } else {
            create2(n);
        }
    }

    // 尾插法
    public void create1(int n) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            insert(0, sc.next());
        }
        sc.close();
    }

    // 头插法
    public void create2(int n) throws Exception {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            append(sc.next());
        }
        sc.close();
    }

    public void clear() {
        length = 0;
        head.next = null;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public Node head() {
        return head;
    }

    public int length() {
        return length;
    }

    public Object get(int index) throws Exception {
        if (index < 0 || index >= length) {
            throw new Exception("Invalid index " + index);
        }
        Node p = head.next;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.data;
    }

    public void append(Object x) {
        Node p = head;
        for (int i = 0; i < length; i++) {
            p = p.next;
        }
        p.next = new Node(x);
        length++;
    }

    public void insert(int index, Object x) throws Exception {
        if (index < 0 || index > length) {
            throw new Exception("Invalid index " + index);
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.next = new Node(x, p.next);
        length++;
    }

    public void remove(int index) throws Exception {
        if (index < 0 || index >= length) {
            throw new Exception("Invalid index " + index);
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        length--;
    }

    public int indexOf(Object x) {
        Node p = head.next;
        int i;
        for (i = 0; p != null && !p.data.equals(x); i++) {
            p = p.next;
        }
        if (p != null) {
            return i;
        } else {
            return -1;
        }
    }
}
