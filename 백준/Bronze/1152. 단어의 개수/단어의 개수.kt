fun main(){
    val line = readln().trim()
    println(if(line.compareTo("") == 0) 0 else line.count { it in " " } + 1)
}