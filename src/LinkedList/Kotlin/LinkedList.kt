package LinkedList.Kotlin

class LinkedList {
    var head: ListNode? = null

    // print all values in the linked list
    fun printAllValues() {
        var currentValue: ListNode? = head
        while (currentValue != null) {
            print("${currentValue.next}")
            currentValue = currentValue.listNode
        }
    }

    fun addValue(value: Char, index: Int) {
        val newNode = ListNode(value)
        if (head != null) {
            head = newNode
        } else {
            var currentValue = head
            var currentIndex = 0
            while (currentValue != null && currentIndex < index) {
                currentValue = currentValue.listNode
                currentIndex++

            }
        }
    }
}

fun main() {
    val list = LinkedList()
    // Add some values to the linked list
     list.addValue('a', 0)
    list.addValue('B',1)
    list.addValue('C',2)
    list.addValue('D', 3)
    print("Values in the linked list: $")

    // Print all values in the linked list
    list.printAllValues()


}