import javax.lang.model.element.Name

fun main() {
  println(e.num)
  f.F()
  sharingwidget.twitterLikesCount()
  sharingwidget.facebookLikesCount()
  sharingwidget.facebookLikesCount()
  sharingwidget.facebookLikesCount()
  sharingwidget.display()

  // anynomous object
  var tsetObj = object{
    val x:Int = 10
    fun method(){
      println("Here it is testobj expression")
    }

  }
  println(tsetObj.method())
  //use of interface as object or anyomously
  var obj = object:clone{
    override fun clogate() {
      println("Hyperdant is my colgate")
    }
  }
obj.clogate()

  // anynomous object used in class

var obj2 = object:person("swiggy"){
  override fun display() {
    super.display()
    println("No this is  not correct")
  }

}
  obj2.display()
}


open class person(val Name:String){
  open fun display(){
    println("${Name} of papa")
  }
}

interface clone{
  fun clogate()
}

//singleton object
object sharingwidget{
  private var twitterLikes =0
  private var facebookLikes = 0
  fun twitterLikesCount() = twitterLikes++
  fun facebookLikesCount() = facebookLikes++
  fun display() = println("twitterLikes - ${twitterLikes} facebooklike - $facebookLikes ")
}



object e{
  var num:Int =5
}

object f{
   fun F(){
      println("fun of object f is called")
   }
}