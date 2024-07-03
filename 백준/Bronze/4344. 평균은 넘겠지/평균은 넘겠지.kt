
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    
    val C = br.readLine().toInt()               // 테스트 case 개수

    repeat(C){
        val st = StringTokenizer(br.readLine())
        val N = st.nextToken().toInt()          // 학생 수
        var total = 0
        val scoreList = mutableListOf<Int>()

        repeat(N){
            scoreList.add(st.nextToken().toInt())
        }
        val avg = scoreList.average()
        bw.append("%.3f%%".format(scoreList.count{
            it > avg
        } / N.toFloat() * 100))
        bw.append("\n")

    }

    bw.flush()
    bw.close()
}