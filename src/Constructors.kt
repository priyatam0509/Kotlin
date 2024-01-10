fun main() {
    var car = Auto("car",4,5)
    var person = Person1()
    println(person.age)
    var bus = Auto("Bolero",5,8)
    println(bus.drivecar())
}

class Auto(val name:String,val tyres:Int,val maxSeating: Int ){
    init {
        println("$name is created")
    }
    fun drivecar(){
        if(tyres>4){
            println("Car is good to drive")
        }
        else{
            println("Car is not good drive")
        }
    }
}

class Person1(){
    val name:String = ""
    var age:Int = 0
}