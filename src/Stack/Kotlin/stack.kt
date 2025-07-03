package Stack.Kotlin

class stack {
    private val item = mutableListOf<Any>()
    private val top = -1

    /**
* fun push() prompts the user to enter the size of the stack and then takes that many elements from the user.
* fun pop() removes the last element from the stack and returns it.
* * fun peek() returns the last element of the stack without removing it.
* * fun isEmpty() checks if the stack is empty and returns a boolean value.
* * fun getTop() returns the top element of the stack without removing it.
* */
    fun push() {
        println("Enter the size of the stack:")
        val size = readLine()?.toIntOrNull()

        if (size == null || size <= 0) {
            println("Invalid size. Please enter a positive integer.")
            return
        }
        for (i in 0 until size) {
            print("Enter element ${i + 1}: ")
            val input = readLine()
            if (input != null)
                item.add(input)
        }
        println("Stack elements: $item")
        println("Stack operations completed successfully.")
    }

    fun isEmpty(): Boolean {
        if (item.isEmpty()) {
            println("Stack is empty.")
            return true
        }
        println("Stack is not empty.")
        return false

    }
    fun isFull():Boolean{
        if(top == item.size -1){
            println("Stack is Full...")
            return true
        }else{
            isEmpty()
            return false
        }
    }
    fun pop(): Any? {
        if (item.isEmpty()) {
            println("Stack is empty, cannot pop.")
            return null
        }
        val element = item.removeAt(item.size - 1)
        println("Popped: $element")
        return element
    }

    fun peek(): Any? {
        if (item.isEmpty()) {
            println("Stack is empty, cannot peek.")
            return null
        }
        val element = item[item.size - 1]
        println("Peeked: $element")
        return element
    }


    fun getTop():Any{
        if(item.isEmpty()){
            println("stack is empty, cannot get top element.")
        }
        return item[item.size - 1]
    }


}
fun main() {
    val stack = stack()
    stack.push()
    stack.isEmpty()
    stack.pop()
    stack.peek()
    stack.getTop()

}