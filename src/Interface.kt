interface A {
    fun printMe() {
        println(" method of interface A")
    }
}
interface B  {
    fun printMeToo() {
        println("I am another Method from interface B")
    }
}

// implements two interfaces A and B
class multipleInterfaceExample: A, B

fun main(args: Array<String>) {
    val obj = multipleInterfaceExample()
    obj.printMe()
    obj.printMeToo()
}
