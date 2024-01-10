//fun main() {
//    val ob = Calaculator()
//    println(ob.add(2,3))
//    println(ob.multiply(4,6))
//
//}
//
//class Calaculator{
//    lateinit var message:String //lateinit can't be int float double it should be only var
//    fun add(a:Int,b:Int):Int{
//        return  a+b
//    }
//    fun multiply(a:Int,b:Int):Int{
//        return  a*b
//    }
//}
fun main() {
    var p1 = Piyush("shyam",23)
    p1.Age=-12
    println(p1.name)


}

class  Piyush(namesarg:String,Ageargs:Int){
    var name:String = namesarg
        get() {
            return field.toUpperCase()
        }
    var Age:Int = Ageargs
        set(value) {
            if(value>0){
                field = value
            }
            else{
                println("Age can't be negative")
            }
        }
}