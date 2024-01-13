fun main() {
//  var l = lora(5.0)
//    println(l.area())
    dragObjects(arrayOf(lora(4.0),Square2(5.0),triangle(3.0,4.0),player("shyam")))
}

interface Draggable{
    fun drag()
}

fun dragObjects(objects:Array<Draggable>){
    for(obj in objects){
        obj.drag()
    }
}
abstract class shape1:Draggable{
    abstract fun area():Double
}
class lora(val radius:Double):shape1(){
    override fun area():Double = Math.PI*radius*radius
    override fun drag()=println("lora is dragged")
}
class Square2(val side:Double):shape1(){
    override fun area(): Double  = side*side
    override fun drag()=println("square is dragged")
}
class triangle(val base:Double,val height:Double):shape1(){
    override fun area():Double=0.5*base*height
    override fun drag()=println("trianle is dragged")
}

class player(val name:String):Draggable{
    override fun drag(){
        println("$name is dragged")
    }

}