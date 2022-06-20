import java.util.Scanner;

class Node {
    public double coef;
    public int expn;
    public Node next;

    public Node() {
        this(0, 0, null);
    }

    public Node(double coef, int expn) {
        this(coef, expn, null);
    }

    public Node(double coef, int expn, Node next) {
        this.coef = coef;
        this.expn = expn;
        this.next = next;
    }
}

class Polynomial {
    private Node head;
    private int length;

    public Polynomial() {
        length = 0;
        head = new Node();
    }

    public Polynomial(double[] coefs, int[] expns) throws Exception {
        this();
        if (coefs.length != expns.length) {
            throw new Exception("The length of coefs must be equal to that of expns.");
        }
        this.length = coefs.length;
        Node p = head;
        for (int i = 0; i < this.length; i++) {
            p.next = new Node(coefs[i], expns[i]);
            p = p.next;
        }
    }

    public Node head() {
        return this.head;
    }

    public int length() {
        return this.length;
    }

    public void append(double coef, int expn) {
        Node p = head;
        for (int i = 0; i < length; i++) {
            p = p.next;
        }
        p.next = new Node(coef, expn);
        length++;
    }

    public void insert(int index, double coef, int expn) throws Exception {
        if (index < 0 || index > length) {
            throw new Exception("Invalid index " + index);
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        p.next = new Node(coef, expn, p.next);
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

    public String toString() {
        // coef
        Node p = head.next;
        StringBuilder builder = new StringBuilder();
        builder.append("coef: [");
        if (length > 0) {
            builder.append(p.coef);
        }
        for (int i = 1; i < length; i++) {
            p = p.next;
            builder.append(", ");
            builder.append(p.coef);
        }
        builder.append("]");
        // expn
        p = head.next;
        builder.append("\nexpn: [");
        if (length > 0) {
            builder.append(p.expn);
        }
        for (int i = 1; i < length; i++) {
            p = p.next;
            builder.append(", ");
            builder.append(p.expn);
        }
        builder.append("]");
        return builder.toString();
    }
}

public class Exercise_1 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        // get term number
        System.out.println("Input n:");
        int n = in.nextInt();
        // input coefs
        System.out.println("Input all coef:");
        double[] coefs = new double[n];
        for (int i = 0; i < n; i++) {
            coefs[i] = in.nextDouble();
        }
        // input expns
        System.out.println("Input all expn:");
        int[] expns = new int[n];
        for (int i = 0; i < n; i++) {
            expns[i] = in.nextInt();
        }
        in.close();
        // create poly and calculate
        Polynomial poly = new Polynomial(coefs, expns);
        Node p = poly.head();
        for (int i = 0; i < n; i++) {
            p = p.next;
            if (p.expn == 0) {
                p.coef = 0;
            } else {
                p.coef *= p.expn;
                p.expn -= 1;
            }
        }
        System.out.println(poly);
    }
}