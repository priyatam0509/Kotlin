//Mutuable List -> can be changed i.e elements can be ADDED/ Removed/Replaced
//Imutuable List -> can't be changed

fun main() {
val nums:List<Int> = listOf(1,2,3)
//    nums[1]=2//it is because listof by default create Imutuable list
val arg = mutableListOf(2,3,4)
    arg[1]=6
    arg.add(6)
    val list2 = listOf(7,8,9)
    arg.addAll(list2)
    println(arg)
    /// MAps ->mutuable and immuatable

    val stud = mutableMapOf<Int,String>()
    stud.put(1,"Piyush")
    stud.put(2,"Nikhil")
    stud.put(3,"Satyam")
    println(stud.get(1))

    for((key:Int,value:String) in stud){
        println("$key = $value")
    }
    val map = mapOf<Int,String>(1 to "Hello",2 to "world")
    println(map)

}