package kotlin.tests

fun main() {
    var x:Int = 0
    while (x<=5){
        println(x)
        x++
    }

    do{
        x = x+10
        println(x)
    } while (x<=40)
}