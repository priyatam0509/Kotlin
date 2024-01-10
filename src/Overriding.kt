//Val can not be reassigned
fun main() {
    var a = Mobile()
    a.name="OnePlus"
    var b = OnePlus()
    var r = a.name
    b.name_of_phone(r)
    println(b.name)

    var food = Swiggy("Pasta")
    food.display()
    println(food.toString())

}
open class Mobile(){
    open var name:String=""
    val size:Int = 0
    fun makeCall(){}
    fun display(){}
    fun powerOff(){}
}
class OnePlus:Mobile(){
    override var name = "Piyush"
    fun name_of_phone(name:String){
        println("name of phone is $name")
    }
}
open class zomato(val food:String){
    open fun display(){
        println("This $food is our speciallity")
    }
}
class Swiggy(food:String):zomato(food){//Here you do not need to intialize the property of the food in parent class but in child class you need to do
    override fun display() {
        super.display()//this is used to display the parent class
        println("Sorry my taste is different")
    }

    override fun toString(): String {
        return "name- $food"
    }
}
//Note there is any method persent in kotlin which is a default method