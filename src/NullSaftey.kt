fun main() {
    var gender2:String? = null
    println(gender2?.toUpperCase())
    gender2?.let {
        println("line 1")
        println("line 2 $gender2")
        println("line 3 $it")
    }
    // assigning default value
    var selectedValue:String = gender2?:"NA"
//    var value:String = gender2!!.toUpperCase()// Null assertor
}