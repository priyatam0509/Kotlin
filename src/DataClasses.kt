fun main() {
   val p1 = Person4(1,"Shyam")
    val p2 = Person4(1,"Shyam")
    val p3 = p1.copy()

    println(p1)
    println(p2)
    println(p1==p2)
    println(p1.hashCode())
   println(p3)
    // destructing in kotlin
    var (id,name) =p1
    println(id)
    println(p1.component2())
}

data class Person4(val Id:Int,val name :String){

}