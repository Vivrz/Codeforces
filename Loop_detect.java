package Codeforces;

public class Loop_detect {
    class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

        Node head;
        public void print(){
            Node curr = head;
            while(curr != null){
                System.out.print(curr.data+ "->");
                curr = curr.next;
            }
        }
        public void Add(int data){
            Node dum = new Node(data);
            if(head == null){
                head = dum;
                return;
            }
            Node curr = head;
            while(curr.next != null){
                curr = curr.next;
            }
            curr.next = dum;
        }

        public void createLoop(int pos){
            if(pos < 1){
                return;
            }
            Node curr = head;
            int c = 1;
            Node store = null;
            while(curr.next != null){
                if(c == pos){
                    store = curr;
                }
                curr = curr.next;
                c++;
            }
            curr.next = store;
        }

        public int Detect(){
            Node slow = head;
            Node fast = head;
        
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
                if(fast == slow){
                    break;
                }
            }
            int c = 1;
            slow = head;
            while(fast != slow){
                fast = fast.next;
                slow = slow.next;
                c++;
            }
            return c;
        }
    public static void main(String[] args) {
        Loop_detect l = new Loop_detect();
        l.Add(5);
        l.Add(8);
        l.Add(6);
        l.Add(7);
        l.Add(5);
        l.Add(9);
        l.Add(10);    
        l.createLoop(6);    
        System.out.println();
        System.out.println(l.Detect());
    }
}
