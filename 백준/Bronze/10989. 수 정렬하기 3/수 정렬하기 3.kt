import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()       // 수의 개수 N
    val counts = IntArray(10001)

    repeat(N){
        counts[br.readLine().toInt()]++
    }

    for(i in counts.indices){
        repeat(counts[i]){
            bw.append("$i").append("\n")
        }
    }

    bw.flush()
    bw.close()

}