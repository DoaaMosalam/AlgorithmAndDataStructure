package Tree;

public class binaryTreeNode {
    public char value;
    private  binaryTreeNode left = null;
    private  binaryTreeNode right = null;
    private int data;

    binaryTreeNode(int item){
        data = item;
        left = right = null;
    }
    public  boolean isLeaf(){
        return left == null &&  right ==null;
    }

    public void print(){
        System.out.println(this.value);
        //print left sub true
        if (this.left!=null)
        this.left.print();
        //print right sub true
        if (this.right!=null )
        this.right.print();
    }
}
