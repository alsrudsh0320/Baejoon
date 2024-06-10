fun main(){
    val N = readln().toInt()
    var result = 1
    if(N != 0){
        for(i in 1 .. N){
            result *= i
        }
    }
    println(result)
}