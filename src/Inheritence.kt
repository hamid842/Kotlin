open class Inheritence {
    fun think() {
        print("sdfklghsfghs")
    }

    open fun ithink() {}
}

class Abc : Inheritence() {        //inheritence is happened when using default constructor
}

//fun main(args: Array<String>) {
    var a = Abc()
//    a.think()
//}


// override the think() method
open class Inheritence1 {
    open fun ithink() {
        print("sdfklghsfghs")
    }
}

class Abcd : Inheritence() {
    override fun ithink() {    //inheritence is happened when using default constructor
        print("fygefuba")
    }
}

fun main(args: Array<String>) {
    var a = Abcd()
    a.ithink()
}