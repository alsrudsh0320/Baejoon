import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val num = br.readLine().toInt()
    val st = StringTokenizer(br.readLine())

    var min = st.nextToken().toInt()
    var max = min

    repeat(num - 1){
        val nextInt = st.nextToken().toInt()
        if(nextInt > max) max = nextInt
        if(nextInt < min) min = nextInt
    }
    bw.append("${min * max}")
    bw.flush()
    bw.close()
}