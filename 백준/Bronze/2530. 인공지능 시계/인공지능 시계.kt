import java.util.Scanner
fun main(){
    val sc = Scanner(System.`in`)
    val hour = sc.nextInt()
    val min = sc.nextInt()
    val sec = sc.nextInt()
    val addTime = sc.nextInt()

    var changeTimeToSec = hour * 3600 + min * 60 + sec + addTime
    while (changeTimeToSec >= 86400){
        changeTimeToSec -= 86400
    }
    println("${changeTimeToSec / 3600} ${(changeTimeToSec / 60) % 60} ${changeTimeToSec % 60}")
    sc.close()
}