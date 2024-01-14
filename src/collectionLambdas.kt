fun main() {
    val nums = listOf(1,3,6,7)
    nums.forEach{println(it)}
    fun isodd(i: Int): Boolean {
         return i%2!=0
    }

    var list = nums.filter(::isodd)
//    var list1 = nums.filter({a:Int->a%2==0})
    var list1 = nums.filter{it%2!=0}

    println(list)
    println(list1)

    val userlist = listOf(
        User(1,"ABC"),
        User(2,"BCD"),
        User(3,"CDE")
    )
    println(userlist.filter {it.id ==2})

    val paidUserList = userlist.map{
        PaidUser(it.id,it.name, type = "Paid")
    }
    println(paidUserList)

}

data class User(val id:Int,val name:String)
data class PaidUser(val id:Int,val name:String, val type:String)