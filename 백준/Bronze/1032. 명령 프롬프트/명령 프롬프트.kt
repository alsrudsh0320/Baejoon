import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()       // 파일 이름의 개수
    var result_line = br.readLine().toCharArray()     // 최종 문자열
    
    repeat(N - 1){
        val current_line = br.readLine()
        current_line.forEachIndexed { index, ch ->
            if(result_line[index] != ch) result_line[index] = '?'
        }
    }
    bw.append(result_line.joinToString(""))
    bw.flush()

}