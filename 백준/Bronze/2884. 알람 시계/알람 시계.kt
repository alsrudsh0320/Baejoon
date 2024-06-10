import java.io.BufferedWriter
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main(){
    val st = StringTokenizer(readln())
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    var H = st.nextToken().toInt()
    var M = st.nextToken().toInt()

    if(M-45 < 0) {
        M += 15
        if(H == 0) H = 23 else H--
    } else {
        M -= 45
    }
    bw.write("$H $M")
    bw.flush()

}