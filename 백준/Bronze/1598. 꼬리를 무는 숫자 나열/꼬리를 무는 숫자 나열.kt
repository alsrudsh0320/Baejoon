import kotlin.math.abs
import kotlin.math.ceil

fun main(){
    val (X, Y) = readln().split(" ").map { it.toInt() }

    val indexA = ceil(X.toFloat() / 4)  // 올림
    val indexB = ceil(Y.toFloat() / 4)  // 올림
    val weight = abs(indexA - indexB).toInt()


    // 높이 계산
    val reX = if(X%4 == 0) 4 else X%4
    val reY = if(Y%4 == 0) 4 else Y%4
    val height = abs(reX - reY)
    println(weight + height)
}