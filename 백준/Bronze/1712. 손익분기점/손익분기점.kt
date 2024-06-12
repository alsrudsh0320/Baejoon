import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val st = StringTokenizer(br.readLine())
    val A = st.nextToken().toInt()    // 고정비용
    val B = st.nextToken() .toInt()    // 가변비용
    val C = st.nextToken().toInt()     // 노트북 가격

    if(B >= C) {
        println(-1)
        return
    }
    println(A / (C - B) + 1)
}