import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    //val bw = BufferedWriter(OutputStreamWriter(System.out))
    val st = StringTokenizer(br.readLine())
    //val sb = StringBuilder()

    var H = st.nextToken().toInt()
    var M = st.nextToken().toInt()

    if(M-45 < 0) {
        M += 15
        if(H == 0) H = 23 else H--
    } else {
        M -= 45
    }
    println("$H $M")
}