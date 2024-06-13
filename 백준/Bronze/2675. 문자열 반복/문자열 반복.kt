import java.lang.StringBuilder
import java.util.StringTokenizer

fun main(){
    val sb = StringBuilder()
    repeat(readln().toInt()){
        val st = StringTokenizer(readln())
        val n = st.nextToken().toInt()
        val s = st.nextToken()
        
        s.forEach {
            sb.append("$it".repeat(n))
        }
        sb.append("\n")
    }
    println(sb)
}