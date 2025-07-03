package LinkedList.Kotlin

class LinkedList {

    // Class to represent a node in the linked list
    class Node(var data: Int, var next: Node? = null)
    // List head
    private var head: Node? = null
    // Function to add a new node at the end of the list

  fun add(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var current = head
            while (current?.next != null) {
                current = current.next
            }
            current?.next = newNode
        }
    }

    // Function to print the linked list
    fun printList() {
        var current = head
        while (current != null) {
            print("${current.data} -> ")
            current = current.next
        }
        println("null")
    }




}
fun main(){
    val list = LinkedList()

}

