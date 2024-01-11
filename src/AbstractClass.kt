//abstract class have only have abstract method
//and abstract class function is defined by their child class
// the instance of abstract class cannot be created
//abstract class can have non abstract function
fun main() {
    var c = Circle(4.0)
    println(c.area())

}
abstract class Shape{
    var name:String = ""
    abstract fun area():Double
    abstract fun display()
}


class Circle(val radius:Double):Shape(){
    override fun area():Double = Math.PI*radius*radius
    override fun display() = println(" area is printed")
}