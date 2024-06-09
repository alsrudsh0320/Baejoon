fun main(){
    var max = 0
    var index = 0
    for(i in 1..9){
        val input = readln().toInt()
        if(max < input) {
            max = input
            index = i
        }
    }
    println("$max\n$index")
    
}