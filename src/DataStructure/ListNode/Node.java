package DataStructure.ListNode;

public class Node {
     public int value;
    public Node next;
    //constructor
    public Node(int v, Node n){
        this.value = v;
        this.next = n;
    }
    //Setter and getter
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}