fun main() {
    val emp = Employee()
    emp.apply {
        age = 30
        name ="ayush"

    }
    println(emp)

    emp.let {
        println(it.name)
        println(it.age)
    }
    with(emp){
        age =50
        name ="Shyam"
    }
    
}

data class Employee(var name:String="",var age:Int =18)