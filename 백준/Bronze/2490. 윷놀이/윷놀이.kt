fun main(){
    repeat(3){
        val result = when(readln().count { it in "0" }){
            1 -> "A"
            2 -> "B"
            3 -> "C"
            4 -> "D"
            0 -> "E"
            else -> ""
        }
        println(result)
    }
}