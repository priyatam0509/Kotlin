//abstract class have only have abstract method
//and abstract class function is defined by their child class
// the instance of abstract class cannot be created
//abstract class can have non abstract function
fun main() {
    var c = Circle4(4.0)
    println(c.area())

}
abstract class Shape1{
    var name:String = ""
    abstract fun area():Double
    abstract fun display()
}


class Circle4(val radius:Double):Shape1(){
    override fun area():Double = Math.PI*radius*radius
    override fun display() = println(" area is printed")
}