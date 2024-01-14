fun main() {
    val day = Day.Sunday
    println(day)
    println(day.n)

    for(i in Day.values()){
        println(i)
    }
    day.printFormattedDay()

    // sealed class
    val red1 =Red("Mushroom",6)
    val red2 = Red("Fire",8)
    println("${red1.type}-${red1.points}")

    // scenario if tile is red multiply it by 2 if blue multiply by 5
    val tile:title = Red("Russian",8)
    val points:Int = when(tile){
        is Red -> tile.points*3
        is Blue -> tile.points*5
    }
    println(points)
}

sealed class title
class Red(val type:String, val points:Int):title()
class Blue(val points: Int):title()


enum class Day(var n:Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednessday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);
    fun printFormattedDay(){
        println("Day is $this")
    }
}