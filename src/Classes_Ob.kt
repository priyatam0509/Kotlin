fun main() {
    var p1 = Person("Piyush",21)
    println(p1.canVote())
}
class Person(val name:String,var age:Int){
    fun canVote(): Boolean{
        return age>18
    }
}