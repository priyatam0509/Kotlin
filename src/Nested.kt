fun main() {
    var z = outer()
    println(z.i)
    var y = outer.nested()
    println(y.display())
    var x = outer().nested1()
    println(x.display())
}
class outer{
    var i=0
    class nested{
        fun display(){
            println("I am inside nested loop")
        }
    }

    inner class nested1{
        fun display(){
            println("I am inside nested loop $i")
        }
    }
}