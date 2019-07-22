class MyTestClass {                           //class header
    private var name: String = "tarlan"
    fun printMe() {
        print(name)                           //class body
    }

    fun maain(args: Array<String>) {
        val obj = MyTestClass()
        obj.printMe()
    }
}


fun main() {
    val demo = Outer.Nested().foo()
    print(demo)
}                                            // nested class

class Outer {
    class Nested {
        fun foo() = "Tarlan"
    }
}


