fun main(){
    val x1 = readln().toInt()               // 1
    val x2 : String = readln()              // 2
    println(x2[2].toString().toInt() * x1)  // 3
    println(x2[1].toString().toInt() * x1)  // 4
    println(x2[0].toString().toInt() * x1)  // 5
    println(x2.toInt() * x1)                // 6
}