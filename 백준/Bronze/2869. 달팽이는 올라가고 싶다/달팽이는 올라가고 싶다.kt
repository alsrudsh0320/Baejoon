import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.ceil

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val st = StringTokenizer(br.readLine())
    val A = st.nextToken().toInt()      // A 미터 올라가기
    val B = st.nextToken().toDouble()      // B 미터 미끄러지기
    val V = st.nextToken().toInt()      // V 미터 나무 // 도달 시 끝

    var days = 0.0
    days = ceil((V - A) / (A - B)) + 1

    bw.append("${days.toInt()}")
    bw.flush()
    bw.close()
}