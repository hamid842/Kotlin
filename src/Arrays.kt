fun main() {
    //an array for numbers
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5)
    println(numbers[4])

    //add a member to array
    val myNumbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5) //Its because of mutable
    myNumbers.add(6)
    println(myNumbers)

    //some methods in kotlin arrays
    val items = listOf(1, 2, 3, 4)

    println(items.first()) //first() print the first member

    println(items.last()) //last() print the last element

    println(items.filter { it % 2 == 0 }) // filter() is for filtering

    val hamid = hashMapOf("A" to 1, "B" to 2) // hashMapOf() is for locating some elements
    println(hamid["A"])

    val string = hashSetOf("a", "b", "c") // hashSetOf() is for locating the array totally
    println(string)
}