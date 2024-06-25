import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    val numA = st.nextToken().reversed().toInt()
    val numB = st.nextToken().reversed().toInt()

    if(numA > numB) bw.append("$numA") else bw.append("$numB")

    bw.flush()
    bw.close()
}