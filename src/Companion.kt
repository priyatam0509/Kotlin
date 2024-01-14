// companion - is like partner through which we share every word and every class a=have onle one companion singleton object
fun main() {
    //MyClass.f() - Here we can directly uses this function without the object clling
//But when we call the below function we will not get the error
    MyClass.MyObject.f()
//But if we use companion as we have used in the below class object we can access the functon directly without the need of calling the object
//Below is the example
    MyClass.g()
// companion is similar to static in java but java does not know about companion so we have to inform about companion using annoators @JvmStatic
}

class MyClass{
    object MyObject{
        fun f(){
            println("Life is full off fucka fuck")
        }
    }
   companion object MyObject1{
        fun g(){
            println("Life is not good")
        }
    }
}