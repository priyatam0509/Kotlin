fun main() {
//    val animal = "Dog"
    val number = 15
    val result = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "not in range"
    }

//    when(animal){
//        "Horse" -> println("Animal is Horse")
//        "Cat" -> println("Animal is cat")
//        "Dog" -> println("Animal is Dog")
//        else -> println("Animal is not found")
//    }
//    val result = when(animal){
//        "Horse" -> println("Animal is Horse")
//        "Cat" -> println("Animal is cat")
//        "Dog" -> println("Animal is Dog")
//        else -> println("Animal is not found")
//    }
    println(result)
}