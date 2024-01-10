fun main() {
    val mustang = car("Mustang","Petrol",1000)
    println(mustang.name)
    println(mustang.drivecar(mustang.name))
}

class car(val name: String,val type: String, val kmRun:Int)
{
    fun drivecar(a:String){
        println("$a car is driving")
    }
    fun applyBreaks(){
        println("Break applied")
    }
}