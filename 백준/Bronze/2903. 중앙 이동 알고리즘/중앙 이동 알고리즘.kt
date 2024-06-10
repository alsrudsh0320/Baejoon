fun main(){
    val N = readln().toInt()
    var rowNum = 2                  // 초기 크기
    repeat(N){
        rowNum = rowNum * 2 - 1    
    }
    println(rowNum * rowNum)
}