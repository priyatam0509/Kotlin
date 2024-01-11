fun main() {
  var l = lora(5.0)
    println(l.area())
}

fun dragObjects(

)
abstract class shape1{
    abstract fun area():Double
    abstract fun drag()
}
class lora(val radius:Double):shape1(){
    override fun area():Double = Math.PI*radius*radius
    override fun drag()=println("lora is dragged")
}
class Square(val side:Double):shape1(){
    override fun area(): Double  = side*side
    override fun drag()=println("square is dragged")
}
class triangle(val base:Double,val height:Double):shape1(){
    override fun area():Double=0.5*base*height
    override fun drag()=println("trianle is dragged")
}