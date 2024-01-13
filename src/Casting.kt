fun main() {
    val circle4 =Circle2(4.0)
    val player = Player("Piyush")

//    for(obj in arr){
//        if(obj is Circle2){
//            println("obj is circle")
//        }
//    }

}

interface Draggable2{
    fun drag()
}

abstract class Shape:Draggable2{
    abstract fun area():Double

}
class Circle2(val radius:Double):Shape(){
    override fun area():Double = Math.PI*radius*radius
    override fun drag()= println("Circle is draggable")
}

class Player(val name:String):Draggable2{
    override fun drag() = println("$name is draggable")
    fun sayMyName() = println("My name is $name")
}