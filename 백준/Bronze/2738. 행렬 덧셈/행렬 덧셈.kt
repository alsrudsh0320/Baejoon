import java.lang.StringBuilder
import java.util.StringTokenizer

fun main(){
    val st = StringTokenizer(readln())
    val N = st.nextToken().toInt()      // row
    val M = st.nextToken().toInt()      // col

    var matrix1 = Array(N) { IntArray(M) {0} }
    var matrix2 = Array(N) { IntArray(M) {0} }
    for(i in 0 until  N){
        val rowST = StringTokenizer(readln())
        for(j in 0 until M){
            matrix1[i][j] = rowST.nextToken().toInt()
        }
    }
    for(i in 0 until  N){
        val rowST = StringTokenizer(readln())
        for(j in 0 until M){
            matrix2[i][j] = rowST.nextToken().toInt()
        }
    }
    // result
    val sb = StringBuilder()
    for(i in 0 until  N){
        for(j in 0 until M){
            sb.append("${matrix1[i][j] + matrix2[i][j]} ")
        }
        sb.append("\n")
    }
    println(sb)
}