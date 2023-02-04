import java.util.Arrays;

public class Iterator {
    private Node head;
    private Node tail;
    private Node ptr;

    private class Node {
        private int val;
        private Data data;
        private Node next;

        public Node() {}

        public Node (int val, Data data) {
            this.val = val;
            this.data = data;
        }
    }

    public Iterator() {
        this.head = new Node();
        this.tail = new Node();
        tail = head;
        this.ptr = new Node();
        ptr = head;
    }

    public void insert(int val, Data data) {
        Node node = new Node(val, data);
        tail.next = node;
        tail = tail.next;
    }

    public void display() {
        Node node = head.next;
        System.out.println("Enrollment Number" + "      " + "Name" + "      " + "Age" + "       " + "Courses");
        while(node != null) {
            System.out.println(node.val + "             " + node.data.name + "      " + node.data.age + "       " + Arrays.toString(node.data.courses));
            node = node.next;
        }
    }

    public boolean hasNext() {
        return ptr.next != null;
    }

    public Student next() {
        ptr = ptr.next;
        return new Student(ptr.val, ptr.data);
    }
}
