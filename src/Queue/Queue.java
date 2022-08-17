package Queue;

import java.util.Arrays;

public class Queue {
    private int size =5;
    private int[] data = new int[size];
    private int front =-1;
    private int rear =-1;

    @Override
    public String toString(){
        return "Queue is{ "+ Arrays.toString(data) +"}";
    }

    public boolean isFull(){
        return rear== size-1;
    }

    public boolean isEmpty(){
        return front==rear;
    }

    public int[] enQueue(int value){
        if (this.isFull()){
            System.out.println("Queue is Full");
        }else {
            rear++;
        }
        return new int[]{data[rear] = value};
    }

    public int deQueue(){
        if (this.isEmpty()){
            System.out.println("Queue is Empty");
        }else {
            front++;
        }
        return data[front];
    }

    public void show() {
        Queue q = new Queue();
      //  System.out.println(q.isFull());
        for (int i = front; i < rear; i++) {
            System.out.println( "   "+data[i]+"  ");
        }
        q.enQueue(19);
        q.enQueue(8);
        q.enQueue(213);
        q.enQueue(12);
        q.enQueue(35);
        System.out.println(q);
        q.enQueue(1000);
        for (int i = front; i <data.length ; i++) {
            System.out.println("Delete element is : " + q.deQueue());
        }
    }

    public static void main(String[] arg) {
        Queue q = new Queue();
        q.show();



    }

}
