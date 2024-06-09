fun main(){
    var totalCOM = 0    // 연결 가능 COM 수
    repeat(readln().toInt()){
        totalCOM += readln().toInt() - 1
    }
    totalCOM++      // 더 이상 이을 멀티탭 없음
    println(totalCOM)
}