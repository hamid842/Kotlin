fun main() {
    val items = listOf(1,2,3,4,5)
    for (i in items)
        println(i)

    for ((index,value) in items.withIndex())  // use withIndex() method
        println("$index , $value")
}