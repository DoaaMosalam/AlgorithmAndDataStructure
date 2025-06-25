package Kotlin.LinkedList

class LinkedList {
   val head: ListNode? = null
    // print all values in the linked list
    fun printAllValues(){
        var currentValue : ListNode? = head
        while(currentValue!=null){
            print("${currentValue.next}")
            currentValue = currentValue.listNode
        }
    }
    fun addValue(){

    }
}
fun main() {
    val list = LinkedList()
    // Add some values to the linked list
    // linkedList.addValue('A')
    // linkedList.addValue('B')
    // linkedList.addValue('C')

    // Print all values in the linked list
    list.printAllValues()
}