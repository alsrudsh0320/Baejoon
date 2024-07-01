import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val N = br.readLine().toInt()       // 과목 본 횟수
    val st = StringTokenizer(br.readLine())
    val list = mutableListOf<Int>()     // 성적 저장 list

    repeat(N){
        list.add(st.nextToken().toInt())
    }
    val M = list.max().toDouble()        // 최대값
    val totalList = list.map {      // 성적 재설정
        it/M*100
    }
    bw.append("${totalList.average()}")
    bw.flush()

}