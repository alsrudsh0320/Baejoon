fun main(){
    val N = readln().toInt()
    for(i in 0 until N){
        println(" ".repeat(i) + "*".repeat(N - i))
    }
}