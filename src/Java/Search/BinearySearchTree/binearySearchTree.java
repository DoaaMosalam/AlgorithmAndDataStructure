package Java.Search.BinearySearchTree;

public class binearySearchTree {
     public treeNode root;
    //Constructor.
    public binearySearchTree(treeNode root){
        this.root=root;
    }
    //this method true this bineary isEmpty or no.
    public  boolean isEmpty(treeNode node){
        boolean status = false;
        if (root == null){
            return true;
        }
        return status;
    }
    //this method tru bineary is leaf.
    public boolean isLeaf(treeNode node){
        return node.right==null && node.left==null;
    }
    //this method add value in bineary tree.
    public void addNode(treeNode newNode, treeNode rootExplore){
        if (rootExplore==null)
            return;
      if (newNode.value > rootExplore.value){
          if (rootExplore.right==null)
              rootExplore.right = newNode;
          else addNode(newNode,rootExplore.right);
      }
      if (newNode.value < rootExplore.value){
          if (rootExplore.left==null)
              rootExplore.left=newNode;
          else addNode(newNode, rootExplore.left);
      }
    }


//this method search in bineary tree.
    public void search(int value,treeNode rootExplore){
        if (rootExplore==null){
            System.out.println("Value is cannot founded");
            return;}
        if (rootExplore.value==value){
            System.out.println("Value found ");
        }
        if (value > rootExplore.value){
            search(value,rootExplore.right);
        }
        if (value< rootExplore.value){
            search(value,rootExplore.left);
        }
    }

    public static void print(){
        treeNode root =new treeNode(7,null,null);
        binearySearchTree bst = new binearySearchTree(root);
        for (int i = 0; i <10 ; i++) {
            treeNode newRoot = new treeNode(i, null, null);
            bst.addNode(newRoot, root);
        }
        bst.search(7,root);
        System.out.println(bst.isLeaf(root));
        System.out.println(bst.isEmpty(root));

    }

    public static void main(String[]args){
       print();

    }
}
