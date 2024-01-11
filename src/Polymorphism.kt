//Polymorphism :- reference of parent class
//but objectof child class
//it means parent can hold the reference of child class but method
//is called of child classes
fun main() {
//    var circle = circle(5.0)
//    println(circle.area())
//    var square = square(6.0)
//    println(square.area())
//
//    var circle1:shape = circle(5.0)
//    println(circle1.area())
//    var square1:shape = square(6.0)
//    println(square1.area())
    val shapes = arrayOf(circle(3.0),circle(5.0),square(6.0))
    calculateAreas(shapes)

}

fun calculateAreas(shapes:Array<shape>){
    for(x in shapes){
        println(x.area())
    }
}

open class shape(){
    open fun area():Double{
        return 0.0
    }
}
class circle(var radius:Double):shape(){

    override fun area():Double{
        return  Math.PI*radius*radius
    }
}

class square(var side:Double):shape(){
    override fun area(): Double {
        return side*side
    }
}