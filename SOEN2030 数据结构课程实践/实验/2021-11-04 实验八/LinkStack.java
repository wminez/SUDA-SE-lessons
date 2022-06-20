public class LinkStack {
    private Node top;
    
    public void clear() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public Object peek() {
        if (!this.isEmpty()) {
            return top.data;
        } else {
            return null;
        }
    }

    public void push(Object x) {
        Node p = new Node(x);
        p.next = top;
        top = p;
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        } else {
            Node p = top;
            top = top.next;
            return p.data;
        }
    }
}
