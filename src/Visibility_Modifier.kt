//Public keyword is used when you make any variable class and function to accessible to all
// internal keyword is similar to public but it is accessible inside one module
//private is used so thst it can be accessed with in the file/class
//protected is not used as top level decleration and it is accesible to only sub classes
fun main() {
    val obA = A()
    val obB = B()
//    obB.

}
open class A{
    public var a =10
    private var b =20
    internal var c =30
    protected var d =50


}

class B:A(){
    fun test(){
        println(a)
//        println(b)
        println(c)
        println(d)
    }
}

