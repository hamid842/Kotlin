class Extension {
    var skills: String = "null"
    fun printMySkills() {
        print(skills)
    }
}

fun main(args: Array<String>) {
    var e1 = Extension()
    e1.skills = "JAVA"   // e1.printMySkills()
    var e2 = Extension()
    e2.skills = "SQL"    // e2.printMySkills()

    var  e3 = Extension()
    e3.skills = e1.addMySkills(e2)
    e3.printMySkills()
}
fun Extension.addMySkills(e:Extension):String{
    var e4 = Extension()
    e4.skills = this.skills + " " +e.skills
    return e4.skills
}
