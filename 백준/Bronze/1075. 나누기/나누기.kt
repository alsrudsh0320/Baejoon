fun main(){
    val N = readln().toInt()        // N >= 100
    val F = readln().toInt()        // F <= 100
    var currentEnd = N % 100        // 현재 끝 두자리
    var currentRemainder = N % F    // 현재 나머지

    // 나머지 0으로 만들기
    if(currentEnd >= currentRemainder){
        currentEnd -= currentRemainder
    }else{
        currentEnd += (F - currentRemainder)
        print(if(currentEnd < 10) "0$currentEnd" else "$currentEnd")
        return
    }

    // 제일 작은 수로 만들기
    currentEnd -= (currentEnd / F) * F
    print(if(currentEnd < 10) "0$currentEnd" else "$currentEnd")

}