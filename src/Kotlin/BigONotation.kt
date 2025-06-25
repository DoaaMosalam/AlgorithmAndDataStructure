package Kotlin

class BigONotation {

    fun SumArray(){
       /*
       * sum array
       * */

       val number = arrayOf(30,10,11,20,40,35)
        var sum =0
        for(num in number)
            sum+=num
        println(message = "Sum all elements of array are: $sum")

    }

}
fun main(){
    val result = BigONotation()
    result.SumArray()
}

