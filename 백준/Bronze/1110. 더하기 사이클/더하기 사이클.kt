import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val N = br.readLine().toInt()       // 0 <= N <= 99
    var currentN = N
    var cycle = 0


    do {
        currentN = (currentN % 10) * 10 + ((currentN / 10 + currentN % 10) % 10)
        cycle++
    } while (currentN != N)


    bw.append("$cycle")
    bw.flush()
    bw.close()
}