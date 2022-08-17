package Stack;

import java.util.Scanner;

public class projectStack {
    private int sizeArray =10;
    private String[] arra = new String[sizeArray];
    private int top= -1;

    public boolean isFull(){
      boolean statues = false;
      if (top == sizeArray-1){
          System.out.println("Library is Full");
      }
      return statues;
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
       arra[top] = s;
    }
    public String pop(){
        isEmpty();
        String v = arra[top];
        top--;
        return v;
    }
    public void show(){
        for (int i = 0; i <top ; i++) {
            System.out.println(arra[i]);
        }
    }

    public void display() {
        int choice = 0;
        int num;
        char ch = 'y';
        String books;

        System.out.println("to add books in library choice number 1.");
        System.out.println("to delete books from library choice number 2.");
        System.out.println("to display all books in library choice number 3.");
        System.out.println("Exit choice 4");
        System.out.print("Choice [1:4]>> ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();

        do {
            if (choice == 1) {
                System.out.println("you choice first a step: ");
                System.out.println("Tell me how many books to add:  ");
                num = input.nextInt();
                System.out.println("Your enter to add " + num + " books to library in stack books.");
                for (int i = 0; i < num; i++) {
                    System.out.println((i + 1) + " Enter name book to add library: ");
                    books = input.next();
                    books += input.nextLine();
                    push(books);
                }
              //  break;
            } else if (choice == 2) {
                System.out.println("You choice secont a step:");
                pop();
                break;
            } else if (choice == 3) {
                show();
            }
        } while (choice != 4);
    }


        public static void main(String[]args){
        projectStack stack = new projectStack();
        stack.display();
        }

}

