package Queue;

public class CircleQueue {
//     int sizeArray =100;
//    int[] arr = new int[sizeArray];
//    int font =-1;
//    int rear = -1;
//    public  boolean isEmpty(){
//        if (font ==-1 && rear ==-1)
//            return true;
//        else return false;
//    }
//    boolean isFull(){
//        if (rear== sizeArray-1) return true;
//        else return false;
//    }
//
//    void enQueue(int value){
//        if (isFull()) return;
//        else  if (isEmpty()){
//            font = rear =0;
//        }
//        else {
//            rear++;
//        }
//        arr[rear] = value;
//    }
//
//    void deQueue(){
//        if (isEmpty()) return;
//        else if (font==rear){
//            font = rear =-1;
//        }
//        else
//        font++;
//    }
//
//    int front_Value(){
//        if (isEmpty()) return -1;
//        return arr[font];
//    }

    private int frontFirst =-1;
    private int lastRear = -1;
    private int sizeArray=5;
    private int[] arr = new int[5];

    public boolean isEmpty(){
//       if (frontFirst == lastRear)
//           return true;
//       else
//           return false;
        return frontFirst== -1 && lastRear ==-1;
    }

    public boolean isFull(){
    return  (frontFirst == lastRear && frontFirst !=-1 ) || (frontFirst == -1
            && lastRear == (arr.length-1));

    }

    public void enQueue(int value){
        if(this.isFull()){
            System.out.println("Queue is full !!");
        }else {
//            if (lastRear == arr.length-1)
//                lastRear = 0;
//            else
        //    lastRear++;
            lastRear = (lastRear+1) % arr.length;
            arr[lastRear] = value;
        }
    }

    public int deQueue(){
        if (this.isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else {
       //     frontFirst++;
           int temp =  arr[frontFirst];
            frontFirst = (frontFirst+1) % arr.length;
            if (frontFirst == lastRear){
                frontFirst = -1;
                lastRear = -1;
            }
            return temp;
        }
    }

    public int printValue(){
        if (isEmpty()) return -1;

            return arr[frontFirst];
    }


    public static void main(String[]args){
        CircleQueue q = new CircleQueue();
        q.enQueue(5);
        q.enQueue(7);
        q.enQueue(9);
        q.enQueue(10);
        q.enQueue(8);
        System.out.println(q.isFull());
        System.out.println(q.deQueue());


    }


}
