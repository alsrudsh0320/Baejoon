
import java.lang.StringBuilder
import java.util.StringTokenizer

fun main(){
    val T = readln().toInt()
    val sb = StringBuilder()
    repeat(T){
        val st = StringTokenizer(readln())
        val a = st.nextToken().toInt()
        val b = st.nextToken().toInt()

        when(a % 10){
            0 -> sb.append("10")
            1 -> sb.append("1")
            2 -> when(b % 4){
                1 -> sb.append("2")
                2 -> sb.append("4")
                3 -> sb.append("8")
                0 -> sb.append("6")
            }
            3 -> when(b % 4){
                1 -> sb.append("3")
                2 -> sb.append("9")
                3 -> sb.append("7")
                0 -> sb.append("1")
            }
            4 -> when(b % 2){
                1 -> sb.append("4")
                0 -> sb.append("6")
            }
            5 -> sb.append("5")
            6 -> sb.append("6")
            7 -> when(b % 4){
                1 -> sb.append("7")
                2 -> sb.append("9")
                3 -> sb.append("3")
                0 -> sb.append("1")
            }
            8 -> when(b % 4){
                1 -> sb.append("8")
                2 -> sb.append("4")
                3 -> sb.append("2")
                0 -> sb.append("6")
            }
            9 -> when(b % 2){
                1 -> sb.append("9")
                0 -> sb.append("1")
            }
        }
        sb.append("\n")
    }
    println(sb)
}