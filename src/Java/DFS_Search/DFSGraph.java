package Java.DFS_Search;

import java.util.Stack;

public class DFSGraph {
    int size;
    adjList[] array;
    public DFSGraph(int size){
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
    public void DFSExplore(int startVertex) {
        boolean[] visited = new boolean[size];
        for (int i = 0; i < size; i++)
            visited[i] = false;
        Stack<Integer> s = new Stack<>();
        s.push(startVertex);
        while (!s.isEmpty()) {
            int n = s.pop();
            s.push(n);
            visited[n] = true;
            Node head = array[n].head;
            Boolean isDone = true;
            while (head != null) {
                if (visited[head.dest] == false) {
                    s.push(head.dest);
                    visited[head.dest] = true;
                    isDone = false;
                    break;
                } else
                    head = head.next;
            }
            if (isDone == true) {
                int outN = s.pop();
                System.out.println("Visit node: " + outN);

            }
        }
    }
    public void DFSSearch(int startVertex,int search){
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
        DFSGraph dfsGraph = new DFSGraph(6);
        dfsGraph.addNode(0,2);
        dfsGraph.addNode(0,1);
        dfsGraph.addNode(1,4);
        dfsGraph.addNode(1,3);
        dfsGraph.addNode(1,0);
        dfsGraph.addNode(3,1);
        dfsGraph.addNode(4,1);
        dfsGraph.addNode(2,5);
        dfsGraph.addNode(2,0);
        dfsGraph.addNode(5,2);
        dfsGraph.DFSExplore(0);
        dfsGraph.DFSSearch(0,5);


    }
}
