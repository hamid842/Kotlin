fun main(args: Array<String>) {
    println("Hey !!!" + ObjExtension.show())
}
class ObjExtension {
    companion object {
        fun show(): String {
            return ("I am learning kotlin")
        }
    }
}
