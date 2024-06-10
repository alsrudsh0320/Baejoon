import java.util.StringTokenizer

fun main(){
    val st = StringTokenizer(readln())

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