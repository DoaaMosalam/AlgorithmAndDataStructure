package Java.Tree;

public class binaryTree {
    static char[] tree = {'h','u','x','m','z','v','n','i'};

  static binaryTreeNode root = null;
  static int data;
  static binaryTree left ,right;

    public boolean isEmpty(){
        return root == null;
    }

    public static int sizeTree(char[]x){
        int i =0;
        for (i = 0; i < x.length; i++) {
      //      System.out.print(" "+x[i]);
        }
        return i;
    }

    public static int lengthTree(binaryTree node){
        if (node == null){
            return -1;
        }else {
            return (lengthTree(left)+1 + lengthTree(right)+1);
        }
    }

    public static void print(){
        root.print();
    }


    public static void main(String[]args){
        char[] list = tree;
//        System.out.println(list);
//        System.out.println( "Size Java.Tree is: " + sizeTree(list));
 //       System.out.println(lengthTree(node));
        print();

    }
}
