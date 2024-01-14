fun main() {
  val icontainer = Container<Int>(3)
    println(icontainer.getValue())
}

class Container<T>(var data:T){
    fun setValue(value:T){
        data = value
    }
    fun getValue():T{
        return data
    }
}

class IntContainer(var data:Int){
    fun setValue(value:Int){
        data = value
    }
    fun getValue():Int{
        return data
    }
}