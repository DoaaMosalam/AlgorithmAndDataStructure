package Arrays.Kotlin

class ArrayStucutre() {

    private val item = mutableListOf<Int>()
    /**
     * write fun take element array from user
     * */

    fun add() {
        println("Enter the size of the array:")
        val size  = readLine()?.toIntOrNull()
       if (size == null || size <=0){
           println("Invalid size. Please enter a positive integer.")
           return
       }
           println("Size Of Array is  $size")

        for(i in 0 until size) {
            print("Enter element ${i+1}: ")
            val input =  readLine()
            if (input != null){


                item.add(input.toInt())
            }
        }
        println("Array elements: $item")
    }

    fun removeElement() {
        if (item.isEmpty()) {
            println("Array is empty. Nothing to remove.")
            return
        }
        println("Enter the element Remove")
        val input = readLine()?.toIntOrNull()
        for (i in item.indices) {
            if (item[i] == input){
                item.removeAt(i)
                println("Element $input removed from the array.")

            }

        }
        println("Updated array: $item")
    }

}


fun main() {
    val arr = ArrayStucutre()
    arr.add()
    arr.removeElement()

}