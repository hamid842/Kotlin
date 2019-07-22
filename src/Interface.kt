import sun.security.pkcs11.wrapper.CK_C_INITIALIZE_ARGS


interface A {
    fun printMe() {
        println("an interface method")
    }
}
interface B{
    fun printMeToo(){
        println("on other interface method")
    }
}

class multipleInterfaceExample :A,B  // implements two interfaces A and B
fun main(args:Array<String>) {
    val obj = multipleInterfaceExample()
    obj.printMe()
    obj.printMeToo()
}
