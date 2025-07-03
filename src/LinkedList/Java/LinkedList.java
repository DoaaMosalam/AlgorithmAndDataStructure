package LinkedList.Java;

public class LinkedList {
   public Node head = null;
    //This method implement display element in linked list
   public void print(){
     Node n = head;
     while (n!=null){
         System.out.printf("%s ",n.value);
         n=n.next;
     }
   }
   public void add(char value,int index) {
       Node newNode = new Node(value);
       if (index == 0) {
           newNode.next = head;
           head = newNode;
       } else {
           Node list = head;
           for (int count = 0; count < index - 1; count++) {
               list = list.next;
           }
           newNode.next = list.next;
           list.next = newNode;
       }
   }

   public void remove(int index){
       if (index ==0){
           head = head.next;
       }else {
           Node i = head;
           for (int count = 0; count < index - 1; count++) {
               i = i.next;
           }
           Node j = i.next;
           i.next = j.next;
       }
   }
    public static void main(String[]args){
        LinkedList list = new LinkedList();

        list.add('D',0);
        list.add('o',1);
        list.add('a',2);
        list.add('a',1);
        list.add('S',0);
        list.add('M',5);
        list.print();
        list.remove(5);
        System.out.println("\n===============================");
        list.print();


    }
}
