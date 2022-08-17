package Stack;

import java.util.Arrays;

public class stack {
 //  static   int size = 10;
//    private static int top;
// static    int data[] = new int[10];
//
//    stack(){
//        top =-1;
//    }
//
//    static void push(int n){
//       if (top==size-1){
//           System.out.println("Stack is full");
//       }else {
//           top++;
//           data[top]=n;
//       }
//    }
//
//    static void pop(){
//        if (top==-1){
//            System.out.println("Stack is empty");
//        }else {
//            top--;
//        }
//    }
//    static void shaow(){
//        // بعكس الاستاك
////        for (int i = top; i >=0 ; i--) {
////            System.out.println(data[i]);
////        }
//        for (int i=0; i <=top; i++) {
//            System.out.println(data[i]);
//        }
//    }
private int sizeArray =10;
 private String[] arr = new String[sizeArray];
 private int top=-1;

    @Override
    public String toString() {
        return
                 Arrays.toString(arr) +
                "\n top=" + top +
                '}';
    }

    public boolean isFull(){
     boolean status = false;
     if (top == sizeArray-1){
         System.out.println("Stack is Full");
     }
     return status;
 }

 public boolean isEmpty(){
        if (top == -1){
            System.out.println("Stack is Empty");
            return true;
        }
        else return false;
 }
 public void push(String s){
     isFull();
     top++;
     arr[top] = s;

 }

     public String pop(){
            isEmpty();
            String v = arr[top];
            top--;
            return v;
     }
    public static void main(String[]args){
       // Stack.stack s = new Stack.stack();
//       push(11);
//       push(12);
//       push(13);
//
//        pop();
//        shaow();
        stack myStack = new stack();
        myStack.push("Doaa");
        myStack.push("Sayed");
       myStack.push("Mosalam");
      myStack.push("Youssef");
       myStack. push("Mohammed");
       myStack.push("Ahmed");
       myStack.push("Mostafa");
        myStack.push("Fatma");
        myStack.push("Mahmoud");
        myStack.push("Tamer Hosseny");
      //  myStack.push("Hamaki");
        System.out.println(myStack);
        String p = myStack.pop();
        System.out.println(p);
        myStack.pop();
        System.out.println(myStack );
    }
}
