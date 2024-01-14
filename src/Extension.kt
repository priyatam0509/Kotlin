fun main() {
    println("Hello Shyam".formattedString())
}

fun String.formattedString():String{
    return "---------\n$this\n--------"
}