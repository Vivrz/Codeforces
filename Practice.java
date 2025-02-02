package Codeforces;

public class Practice {
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void Add(int data) {
        Node dum = new Node(data);
        if (head == null) {
            head = dum;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = dum;
    }

    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void createLoop(int pos) {
        if (pos < 1) {
            return;
        }
        Node curr = head;
        int c = 1;
        Node store = null;
        while (curr.next != null) {
            if (c == pos) {
                store = curr;
            }
            curr = curr.next;
            c++;
        }
        curr.next = store;
    }

    public boolean Loop() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public int detect(){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                
                break;
            }
        }
        slow = head;
        int c = 1;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        p.Add(5);
        p.Add(2);
        p.Add(5);
        p.Add(7);
        p.Add(9);
        p.createLoop(2);
        // p.print();
        System.out.println(p.Loop());
        System.out.println(p.detect());
    }
}
