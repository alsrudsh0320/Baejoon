import java.util.StringTokenizer

fun main(){
    val st = StringTokenizer(readln())
    val N = st.nextToken().toInt()
    val K = st.nextToken().toInt()
    var countDivisor = 0
    var state = false
    loop@
    for(i in 1 .. N){

        if(N % i == 0) countDivisor++
        if(countDivisor == K) {
            println(i)
            state = true
            break@loop
        }
    }
    if(!state) println(0)
}