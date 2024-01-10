fun main() {
    var arr = arrayOf("one","Two","Three")
    var arr1 = arrayOf(1,2,3)
    var arr2 = arrayOf<Int>(4,5,6)

    for(i in arr1){
        println(i)
    }
//    print array element with index
    for((i,e) in arr2.withIndex()){
        println("The value of array 2 at index $i is $e")
    }
    println(arr[0])
    println(arr.get(1))
    arr[1] = "four"
    println(arr[1])
    arr.set(0,"Hello")
    println(arr[0])
    println(arr.size)
}