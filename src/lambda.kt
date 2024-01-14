fun main() {
  var fn=::sum
    println(fn(3.0,5.0))

val sum ={a:Int,b:Int->a+b}
    val lambda2:(Int)->Int ={x->x*x}
    calc(6.0,7.0,::sum)

    val simplifySingleParam:(Int)->Int={it*it}
}
 fun sum (a:Double,b:Double):Double{
     return  a+b
 }
//Higher order function - means expect function as argument or return function
fun calc(a:Double,b:Double,gn:(Double,Double)->Double){
     val result = gn(a,b)
    println(result)
}

