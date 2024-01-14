//fun main() {
//    var arr:Array<Int> = arrayOf(1,2,3)
//    try {
//        println(arr[5])
//    }
//    catch() {
//        println("please check the array index")
//
//    }
////    finally {
////        println("I will execute no matter what happen")
////
////    }
//}

fun main() {
  createUserList(-4)
}

fun createUserList(count:Int){
    if(count<0){
        throw IllegalArgumentException("count must be greater than zero")
    }
    else{
        println("User list created")
    }
}