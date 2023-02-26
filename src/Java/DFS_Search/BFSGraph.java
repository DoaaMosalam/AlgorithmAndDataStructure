package Java.DFS_Search;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSGraph {
    int size;
    adjList[] array;
    public BFSGraph(int size){
        this.size=size;
        array = new adjList[this.size];
        for (int i = 0; i <size ; i++) {
            array[i] = new adjList();
            array[i].head=null;
        }
    }
    public void addNode(int scr,int dest){
        Node n = new Node(dest,null);
        n.next = array[scr].head;
        array[scr].head=n;
    }
    public void BFSExplore(int startVertex) {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        Queue<Integer> s = new LinkedList<Integer>();
        s.add(startVertex);
        while (!s.isEmpty()) {
            int n = s.poll();
            System.out.println("Visited: " + n);
            visited[n] = true;
            Node head = array[n].head;
            while (head != null) {
                if (visited[head.dest] == false) {
                    s.add(head.dest);
                    visited[head.dest] = true;
                } else
                    head = head.next;
            }
        }
    }
    public void BFSSearch(int startVertex,int search){
        Boolean[] visited = new Boolean[size];
        Boolean isFound = false;
        for (int i = 0; i <size ; i++)
            visited[i] = false;
            Stack<Integer> s = new Stack<>();
            s.push(startVertex);
            while (! s.isEmpty()){
                int n = s.pop();
                s.push(n);
                visited[n] = true;
                Node head = array[n].head;
                Boolean isDone = true;
                while (head!=null){
                    if (search==head.dest){
                        System.out.println("node is founded");
                        isFound=true;
                        break;
                    }
                    if (visited[head.dest]==false){
                        s.push(head.dest);
                        visited[head.dest]=true;
                        isDone=false;
                        break;
                    }else
                        head=head.next;
                }
                if (isFound==true){
                    break;
                }
                if (isDone==true){
                    int outN = s.pop();
                    System.out.println("Visite node: " + outN);

                }
            }
            if (isFound==false){
                System.out.println("Node cannot found.");
                }
    }

    public static void main(String[] args) {
        BFSGraph bfsGraph = new BFSGraph(6);
        bfsGraph.addNode(0,2);
        bfsGraph.addNode(0,1);
        bfsGraph.addNode(1,4);
        bfsGraph.addNode(1,3);
        bfsGraph.addNode(1,0);
        bfsGraph.addNode(3,1);
        bfsGraph.addNode(4,1);
        bfsGraph.addNode(2,5);
        bfsGraph.addNode(2,0);
        bfsGraph.addNode(5,2);
        bfsGraph.BFSExplore(0);
        bfsGraph.BFSSearch(0,5);


    }

}
