import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val M = sc.nextInt()    // 컵 바꾼 횟수
    var currentCup = 1      // 현재 공 위치 컵 번호

    for(i in 1..M){
        val X = sc.nextInt()
        val Y = sc.nextInt()

        if(currentCup != X && currentCup != Y){
            continue
        }else if(currentCup == X){
            currentCup = Y
        }else{
            currentCup = X
        }
    }
    sc.close()

    println(currentCup)

}