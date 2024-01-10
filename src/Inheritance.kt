fun main() {
var b =Phone()
    b.makeCall()
    var a = BasicPhone()
    a.makeCall()
    var c = SmartPhone()
    c.makeCall()
}
open class Phone(){
    val name:String =""
    val type:String =""
    val volume:Int =10

    fun makeCall(){
        println("Please make a call to russia")
    }
    fun display(){}
    fun poweroff(){}
    fun getDeviceInfo(){}

}
open class BasicPhone:Phone(){
    fun getScreenInfo(){}
}
class SmartPhone:BasicPhone(){
    fun playMovie(){}
    fun takePicture(){}
    fun getLocation(){}
}
