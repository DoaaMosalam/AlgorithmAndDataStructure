package Java.ListNode.DataStructure;

public class implementLinkedList {
    Node head;

    //constructor.
    public implementLinkedList(Node h) {
        this.head = h;
    }

    public void add(Node newnode) {
        newnode.next = head;
    }

    public void remov() {
        head = head.next;
    }
    public void Display(){
        Node n = head;
        while (n != null){
            System.out.println(n.value);
            n =n.next;
        }
    }
    public void print(){
        Node n = head;
        while (n!=null){
            System.out.println(n.getValue());
            n = n.getNext();
        }

    }

    public static void main(String[]args){
        implementLinkedList ls = new implementLinkedList(new Node(12,null));
        ls.add(new Node(11,null));
        ls.add(new Node(13,null));
        ls.Display();
        ls.remov();

    }

}
